package com.janus;

import com.janus.images.Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;

public class Jframe extends Client implements ActionListener, WindowListener {

    private static final long serialVersionUID = 1L;
    public static JFrame frame;
    public static TrayIcon trayIcon;
    public static boolean minimised = false;
    public static boolean hasFocus = false;


    Image icon = javax.imageio.ImageIO.read(Resources.class.getResourceAsStream("icon.png"));

    public Jframe(String[] args, int width, int height, boolean resizable) throws IOException {
        super();
        setTray();
        try {
            signlink.startpriv(InetAddress.getByName(Configuration.HOST));
            initUI(width, height, resizable);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void setTray() {
        if (SystemTray.isSupported()) {
            //Image icon = Toolkit.getDefaultToolkit().getImage("/images/icon.png");
            trayIcon = new TrayIcon(icon, Configuration.CLIENT_NAME);
            trayIcon.setImageAutoSize(true);
            try {
                SystemTray tray = SystemTray.getSystemTray();
                tray.add(trayIcon);

                //	trayIcon.displayMessage(Configuration.CLIENT_NAME, "Has been launched successfully!", TrayIcon.MessageType.INFO);

                final MenuItem minimizeItem = new MenuItem("Hide " + Configuration.CLIENT_NAME);
                MenuItem BLANK = new MenuItem("-");
                MenuItem exitItem = new MenuItem("Quit");
                ActionListener minimizeListener = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (frame.isVisible()) {
                            frame.setVisible(false);
                            minimizeItem.setLabel("Show 1# " + Configuration.CLIENT_NAME + ".");
                        } else {
                            frame.setVisible(true);
                            minimizeItem.setLabel("Hide 1# " + Configuration.CLIENT_NAME + ".");
                        }
                    }
                };
                minimizeItem.addActionListener(minimizeListener);
                ActionListener exitListener = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                        tray.remove(trayIcon);
                    }
                };
                exitItem.addActionListener(exitListener);
            } catch (AWTException e) {
                System.err.println(e);
            }
        }
    }


    public void initUI(int width, int height, boolean resizable) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JPopupMenu.setDefaultLightWeightPopupEnabled(false);

            frame = new JFrame(Configuration.CLIENT_NAME);
            frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


            frame.setAlwaysOnTop(Client.ALWAYS_ON_TOP);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) {
                    String[] options = {"Close", "AFK!"};
                    int userPrompt = JOptionPane.showOptionDialog(null, "Why not use ::AFK Instead!", "  Close Janus..?",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
                    if (userPrompt == JOptionPane.YES_OPTION) {
                        System.exit(-1);
                        System.exit(0);
                    }
                }

                public void windowIconified(WindowEvent we) {
                    minimised = true;
                }

                public void windowDeiconified(WindowEvent we) {
                    minimised = false;
                }
            });

            frame.addWindowFocusListener(new WindowAdapter() {
                public void windowLostFocus(WindowEvent we) {
                    hasFocus = false;
                }

                public void windowGainedFocus(WindowEvent we) {
                    hasFocus = true;
                }
            });

            setFocusTraversalKeysEnabled(false);
            JPanel gamePanel = new JPanel();
            super.setPreferredSize(new Dimension(width, height));
            frame.setLayout(new BorderLayout());
            gamePanel.setLayout(new BorderLayout());
            gamePanel.add(this);
            gamePanel.setBackground(Color.BLACK);
            initializeMenuBar();
            frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
            frame.pack();
            frame.setResizable(resizable);
            init();
            graphics = getGameComponent().getGraphics();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            minimised = false;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rebuildFrame(int width, int height, boolean resizable, boolean undecorated) {


        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
        frame = new JFrame(Configuration.CLIENT_NAME);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String[] options = {"Close", "AFK!"};
                int userPrompt = JOptionPane.showOptionDialog(null, "Why not use ::AFK Instead!", "  Close Janus..?",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
                if (userPrompt == JOptionPane.YES_OPTION) {
                    System.exit(-1);
                    System.exit(0);
                } else {

                }
            }
        });
        frame.setUndecorated(undecorated);
        setFocusTraversalKeysEnabled(false);
        JPanel gamePanel = new JPanel();
        super.setPreferredSize(new Dimension(width - 10, height - 10));
        frame.setLayout(new BorderLayout());
        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(this, BorderLayout.CENTER);
        gamePanel.setBackground(Color.BLACK);
        if (!undecorated) {
            frame.getContentPane().add(menuPanel, BorderLayout.NORTH);
        }
        frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
        frame.pack();
        frame.setResizable(resizable);
        //init();
        graphics = getGameComponent().getGraphics();
        frame.setLocation((screenWidth - width) / 2, ((screenHeight - height) / 2) - screenHeight == Client.getMaxHeight() ? 0 : undecorated ? 0 : 70);
        frame.setVisible(true);


        frame.addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {

                Dimension dimension = new Dimension(frame.getWidth(), frame.getHeight());

                gamePanel.setMinimumSize(dimension);
                gamePanel.setPreferredSize(dimension);
                gamePanel.setSize(dimension);

                Jframe.super.setPreferredSize(new Dimension(frame.getWidth() - 10, frame.getHeight() - 10));
                Jframe.super.revalidate();
                Jframe.super.repaint();

                Jframe.super.graphics = getGameComponent().getGraphics();

            }

        });

    }

    public void setClientIcon() {
        Image img = Toolkit.getDefaultToolkit().getImage("src\\com\\janus\\images\\icon.png");
        if (img == null)
            return;
        frame.setIconImage(img);

    }


    /**
     * Our jpanel for the menu bar
     */
    private static JPanel menuPanel;

    /**
     * Initializes the menu bar
     */
    public void initializeMenuBar() {

        /*
         * Initialize our menu panel to hold our menu buttons
         */
        menuPanel = new JPanel();

        /*
         * Set the menu panel as non focusable
         */
        menuPanel.setFocusable(false);

        /*
         * Disable focus traversal keys
         */
        menuPanel.setFocusTraversalKeysEnabled(false);

        menuPanel.setBackground(Color.decode("#420000"));

        menuPanel.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
        menuPanel.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);

        /*
         * Create our buttons
         */
        JButton pricesButton = createButton("Prices", "prices.gif", "The official Janus Price Guide!");
        JButton forumsButton = createButton("Wiki", "wiki.gif", "Open the Janus Wiki.");
        JButton storeButton = createButton("Donate", "donate.gif", "Open the official Janus store.");
        JButton voteButton = createButton("Vote", "vote.png", "Open the official Janus voting page.");
        JButton scoresButton = createButton("HiScores", "hiscores.png", "Open the official Janus Highscores");
        JButton tsButton = createButton("Join Discord", "discord.png", "Join the Janus discord.");


        /*
         * Add our buttons to the menu panel
         */
        menuPanel.add(pricesButton);
        menuPanel.add(forumsButton);
        menuPanel.add(storeButton);
        menuPanel.add(voteButton);
        menuPanel.add(scoresButton);
        menuPanel.add(tsButton);

        /*
         * Add our menu panel to our frame
         */
        frame.getContentPane().add(menuPanel, BorderLayout.NORTH);
    }

    /**
     * Creates a button on the menu panel
     *
     * @param title   The Title of the button
     * @param image   The image to display
     * @param tooltip The tooltip when hovering over the button
     * @return The created button
     */
    private JButton createButton(String title, String image, String tooltip) {
        JButton button = new JButton(title);
        if (image != null)
            button.setIcon(new ImageIcon(ResourceLoader.loadImage(image)));
        button.addActionListener(this);
        if (tooltip != null)
            button.setToolTipText(tooltip);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setForeground(Color.WHITE);
        return button;
    }

    public URL getCodeBase() {
        try {
            return new URL("http://" + Configuration.HOST + "/");
        } catch (Exception e) {
            return super.getCodeBase();
        }
    }

    public URL getDocumentBase() {
        return getCodeBase();
    }

    public void loadError(String s) {
        System.out.println("loadError: " + s);
    }

    public String getParameter(String key) {
        return "";
    }

    public static void openUpWebSite(String url) {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI(url));
        } catch (Exception e) {
        }
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
        try {
            if (cmd != null) {
                switch (cmd) {
                    case "Home":
                        openURL("https://www.janus.rip/");
                        break;
                    case "Prices":
                        openURL("https://flub.link/priceguide");
                        break;
                    case "Wiki":
                        openURL("https://janus-317.fandom.com/wiki/Category:Guides");
                        break;
                    case "Donate":
                        openURL("https://flub.link/donate");
                        break;
                    case "Vote":
                        openURL("https://vote.janus.rip");
                        break;
                    case "HiScores":
                        openURL("https://hiscores.janus.rip");
                        break;
                    case "Join Discord":
                        openURL("https://discord.gg/JcxB9ep");
                        break;
                }

            }
        } catch (Exception e) {
        }
    }

    /**
     * Opens a URL in your default web browser
     *
     * @param url The url of the website to open
     */
    static void openURL(String url) {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();
    int screenWidth = (int) screenSize.getWidth();
    int screenHeight = (int) screenSize.getHeight();

}