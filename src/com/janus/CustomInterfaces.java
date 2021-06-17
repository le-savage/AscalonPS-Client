/*

package com.janus;

import com.janus.RSInterface;
import com.janus.TextDrawingArea;
import com.janus.Configuration;

public class CustomInterfaces extends RSInterface {


private static final int CLOSE_BUTTON = 580, CLOSE_BUTTON_HOVER = 581;

public TextDrawingArea tda[];
public CustomInterfaces(TextDrawingArea tda[]) {
this.tda = tda;
}

public void loadCustoms() {

OsDropViewer();
}


public void OsDropViewer() {
RSInterface tab = addInterface(33000);
//String dir = "DropViewer/SPRITE";
addSprite(33001, 1217); //changeid
addHoverButton(33002, 1208, 21, 21,"Close", 0, 33003, 1); //changeid
addHoveredButton(33003, 1209, 21, 21, 33004); //changeid
addText(33005, "Loot Viewer", tda, 2, 0xFFA500, true, true);
int x = 7, y = 7;
tab.totalChildren(7);
tab.child(0, 33001, 0+x, 0+y);
tab.child(1, 33002, 472+x, 7+y);
tab.child(2, 33003, 472+x, 7+y);
tab.child(3, 33005, 250+x, 11+y);
tab.child(4, 33006, 8+x, 41+y);
tab.child(5, 34000, 150+x, 35+y);
tab.child(6, 33007, 6+x, 58+y);

final RSInterface results = addInterface(33007);
results.width = 122;
results.height = 258;
results.scrollMax = 300;

results.totalChildren(100);
for (int j = 0; j < 100; j++) {
addClickableText(33008 + j, "", "View Drops", tda, 0, 0xff0000, false, true, 110);
results.child(j, 33008 + j, 3, 2 + (j*14));
}

RSInterface main = addInterface(34000);
main.totalChildren(720);
main.width = 328;
main.height = 281;
main.scrollMax = 2560;
addSprite(34001, 1210); //changeid
addSprite(34002, 1211); //changeid
for(int i = 0; i < 40; i++) {
main.child(i, 34001, 0, (i * 64));
main.child(i + 40, 34002, 0, 32 + (i * 64));
}
addText(34003, "Amount:", tda, 0, 0xff9040, true, true);
addText(34004, "Chance:", tda, 0, 0xff9040, true, true);
addText(34005, "Value:", tda, 0, 0xff9040, true, true);
for (int i = 0; i < 80; i++) {
itemGroup(34010 + i, 1, 1, 1, 1, false, false);
interfaceCache[34010 + i].inv[0] = 14485;
interfaceCache[34010 + i].invStackSizes[0] = 1;
addText(34100 + i, "Name", tda, 1, 0xFFA500, false, true);
addText(34200 + i, "Amount", tda, 0, 0xffffff, true, true);
addText(34300 + i, "Chance", tda, 0, 0xffffff, true, true);
addText(34400 + i, "Value", tda, 0, 0xffffff, true, true);
int yy = (i * 32);
main.child(80+i, 34010+i, 1, 0+yy);
main.child(160+i, 34100+i, 39, 6+yy);
main.child(240+i, 34003, 175, 2+yy);
main.child(320+i, 34004, 234, 2+yy);
main.child(400+i, 34005, 293, 2+yy);
main.child(480+i, 34200+i, 175, 14+yy);
main.child(560+i, 34300+i, 234, 14+yy);
main.child(640+i, 34400+i, 293, 14+yy);
}

addClickableTextHeight(33006, "@whi@Search for an NPC", "Filter", tda, 0, 0xff0000, true, true, 134, 10);




}
}


*/
