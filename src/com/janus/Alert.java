/*
package com.janus;

import org.nikkii.alertify4j.Alertify;
import org.nikkii.alertify4j.AlertifyBuilder;
import org.nikkii.alertify4j.AlertifyType;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Alert implements WindowListener {


					public static void sendTrayMessage(int type, String message) {
															if (type == 1) {
																				Alertify.show(new AlertifyBuilder()
																				.type(AlertifyType.LOG)
																				.text(message)
																				.autoClose(5000)
																				.build());
															} else if (type == 2) {
																				Alertify.show(new AlertifyBuilder()
																				.type(AlertifyType.ERROR)
																				.text(message)
																				.autoClose(5000)
																				.build());
															} else if (type == 3) {
																				Alertify.show(new AlertifyBuilder()
																				.type(AlertifyType.SUCCESS)
																				.text(message)
																				.autoClose(5000)
																				.build());
															} else if (type == 4) {
																				Alertify.show(new AlertifyBuilder()
																				.type(AlertifyType.WARNING)
																				.text(message)
																				.autoClose(5000)
																				.build());
															}
										}

					@Override
					public void windowOpened(WindowEvent e) {
										System.out.print("ALERT WINDOW OPENED");
					}

					@Override
					public void windowClosing(WindowEvent e) {
										System.out.print("ALERT WINDOW CLOSING");
					}

					@Override
					public void windowClosed(WindowEvent e) {
										System.out.print("ALERT WINDOW CLOSED");
					}

					@Override
					public void windowIconified(WindowEvent e) {
										System.out.print("ALERT WINDOW ICONIFIED");
					}

					@Override
					public void windowDeiconified(WindowEvent e) {
										System.out.print("ALERT WINDOW DE - ICONIFIED");
					}

					@Override
					public void windowActivated(WindowEvent e) {
										System.out.print("ALERT WINDOW ACTIVATED");
					}

					@Override
					public void windowDeactivated(WindowEvent e) {
										System.out.print("ALERT WINDOW DEACTIVATED");
					}
}
*/
