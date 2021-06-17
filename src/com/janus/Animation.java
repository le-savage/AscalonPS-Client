package com.janus;

public final class Animation {

    public static void unpackConfig(CacheArchive streamLoader) {
        Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
        int length = stream.readUnsignedWord();
        if (anims == null)
            anims = new Animation[length];
        for (int j = 0; j < length; j++) {
            if (anims[j] == null)
                anims[j] = new Animation();
            anims[j].readValues(stream);

            if (j == 884) {
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
            }
            if (j == 4495) {// cerberus death anim
                anims[j].frameCount = 14;
                anims[j].frameIDs = new int[]{117309441, 117309557, 117309612, 117309536, 117309603, 117309563,
                        117309609, 117309567, 117309502, 117309607, 117309516, 117309626, 117309463, 117309514};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{5, 5, 5, 5, 5, 5, 3, 3, 5, 5, 3, 3, 4, 4};
                anims[j].loopDelay = 1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 10;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            }
            if (j == 5070) { // Zulrah
                anims[j] = new Animation();
                anims[j].frameCount = 9;
                anims[j].loopDelay = -1;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
                anims[j].oneSquareAnimation = false;
                anims[j].frameIDs = new int[]{11927608, 11927625, 11927598, 11927678, 11927582, 11927600, 11927669,
                        11927597, 11927678};
                anims[j].delays = new int[]{5, 4, 4, 4, 5, 5, 5, 4, 4};
            }
            if (j == 5069) {
                anims[j].frameCount = 15;
                anims[j].loopDelay = -1;
                anims[j].forcedPriority = 6;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 1;
                anims[j].oneSquareAnimation = false;
                anims[j].frameIDs = new int[]{11927613, 11927599, 11927574, 11927659, 11927676, 11927562, 11927626,
                        11927628, 11927684, 11927647, 11927602, 11927576, 11927586, 11927653, 11927616};
                anims[j].delays = new int[]{3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
            }
            if (j == 5072) {
                anims[j].frameCount = 21;
                anims[j].loopDelay = 1;
                anims[j].forcedPriority = 8;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
                anims[j].oneSquareAnimation = false;
                anims[j].frameIDs = new int[]{11927623, 11927595, 11927685, 11927636, 11927670, 11927579, 11927664,
                        11927666, 11927661, 11927673, 11927633, 11927624, 11927555, 11927588, 11927692, 11927667,
                        11927556, 11927630, 11927695, 11927643, 11927640};
                anims[j].delays = new int[]{2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
            }
            if (j == 5073) {
                anims[j].frameCount = 21;
                anims[j].loopDelay = -1;
                anims[j].forcedPriority = 9;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
                anims[j].oneSquareAnimation = false;
                anims[j].frameIDs = new int[]{11927640, 11927643, 11927695, 11927630, 11927556, 11927667, 11927692,
                        11927588, 11927555, 11927624, 11927633, 11927673, 11927661, 11927666, 11927664, 11927579,
                        11927670, 11927636, 11927685, 11927595, 11927623};
                anims[j].delays = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2};
            }
            if (j == 5806) {
                anims[j].frameCount = 55;
                anims[j].loopDelay = -1;
                anims[j].forcedPriority = 6;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
                anims[j].oneSquareAnimation = true;
                anims[j].frameIDs = new int[]{11927612, 11927677, 11927615, 11927573, 11927618, 11927567, 11927564,
                        11927606, 11927675, 11927657, 11927690, 11927583, 11927672, 11927552, 11927563, 11927683,
                        11927639, 11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656,
                        11927660, 11927629, 11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644,
                        11927656, 11927660, 11927635, 11927668, 11927614, 11927560, 11927687, 11927577, 11927569,
                        11927557, 11927569, 11927577, 11927687, 11927560, 11927651, 11927611, 11927680, 11927622,
                        11927691, 11927571, 11927601};
                anims[j].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 3};
            }
            if (j == 5807) {
                anims[j].frameCount = 53;
                anims[j].loopDelay = -1;
                anims[j].forcedPriority = 6;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
                anims[j].oneSquareAnimation = true;
                anims[j].frameIDs = new int[]{11927612, 11927677, 11927615, 11927573, 11927618, 11927567, 11927564,
                        11927606, 11927675, 11927657, 11927690, 11927583, 11927672, 11927552, 11927563, 11927683,
                        11927639, 11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644, 11927656,
                        11927660, 11927629, 11927635, 11927668, 11927614, 11927627, 11927610, 11927693, 11927644,
                        11927656, 11927604, 11927637, 11927688, 11927696, 11927681, 11927605, 11927681, 11927696,
                        11927688, 11927637, 11927604, 11927656, 11927611, 11927680, 11927622, 11927691, 11927571,
                        11927601};
                anims[j].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 3};
            } // End Of Zulrah
            if (j == 618) {//start fishing
                anims[j].frameIDs = new int[]{19267634, 19267645, 19267656, 19267658, 19267659, 19267660, 19267661, 19267662, 19267663, 19267635, 19267636, 19267637, 19267638, 19267639, 19267640, 19267641, 19267642, 19267643, 19267644, 19267646, 19267647, 19267648, 19267649, 19267650, 19267651, 19267650, 19267649, 19267648, 19267647, 19267648, 19267649, 19267650, 19267651, 19267652, 19267653, 19267654, 19267655, 19267657, 19267763, 19267764, 19267765, 19267766};
            }
            if (j == 619) {
                anims[j].frameIDs = new int[]{19267664, 19267675, 19267686, 19267691, 19267692, 19267693, 19267694, 19267695, 19267696, 19267665, 19267666, 19267667, 19267668, 19267669, 19267670, 19267671, 19267672, 19267673, 19267674, 19267676, 19267677, 19267678, 19267679, 19267668, 19267669, 19267670, 19267671, 19267672, 19267673, 19267674, 19267676, 19267677, 19267678, 19267679, 19267680, 19267681, 19267682, 19267683, 19267684, 19267685, 19267687, 19267688, 19267689, 19267690};
            }
            if (j == 620) {
                anims[j].frameIDs = new int[]{19267697, 19267708, 19267719, 19267724, 19267725, 19267726, 19267727, 19267728, 19267729, 19267698, 19267699, 19267700, 19267701, 19267702, 19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267701, 19267702, 19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267713, 19267714, 19267715, 19267716, 19267717, 19267718, 19267720, 19267721, 19267722, 19267723};
            }
            if (j == 621) {
                anims[j].frameIDs = new int[]{19267697, 19267708, 19267719, 19267724, 19267725, 19267726, 19267727, 19267728, 19267729, 19267698, 19267699, 19267700, 19267701, 19267702, 19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267701, 19267702, 19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267713, 19267714, 19267715, 19267716, 19267717, 19267718, 19267720, 19267721, 19267722, 19267723};
            }
            if (j == 622) {
                anims[j].frameCount = 19;
                anims[j].frameIDs = new int[]{19267585, 19267586, 19267587, 19267588, 19267589, 19267590, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267591, 19267592, 19267591, 19267592};
                anims[j].delays = new int[]{15, 4, 4, 4, 12, 4, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
            }
            if (j == 623) {
                anims[j].frameIDs = new int[]{19267585, 19267586, 19267587, 19267588, 19267589, 19267590, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267591, 19267592, 19267591, 19267592};
                anims[j].delays = new int[]{15, 4, 4, 4, 12, 4, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
            }//end of fishing


			/*if (j == 8532) {
				anims[ 8532].frameCount = 16;
				anims[8532].forcedPriority = 6;
				anims[8532].frameIDs = new int[]{157483009, 157483034, 157483058, 157483070, 157483035, 157483050, 157483066, 157483014, 157483139, 157483068, 157483111, 157483015, 157483048, 157483012, 157483092, 157483093};
				anims[8532].delays = new int[]{5, 5, 5, 6, 6, 5, 5, 4, 4, 3, 3, 4, 2, 3, 5, 5};
			}*/

		/*	if (j == 8532) {
				anims[j].frameIDs = new int[]{157483009, 157483034, 157483058, 157483070, 157483035, 157483050, 157483066, 157483014, 157483139, 157483068, 157483111, 157483015, 157483048, 157483012, 157483092, 157483093};
				anims[j].delays = new int[]{5, 5, 5, 6, 6, 5, 5, 4, 4, 3, 3, 4, 2, 3, 5, 5};
				anims[j].forcedPriority = 6;
				anims[j].frameCount = 16;

				anims[j].frameIDs2 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
				anims[j].delays = new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
				anims[j].loopDelay = -1;
				anims[j].animationFlowControl = null;
				anims[j].oneSquareAnimation = false;
				anims[j].forcedPriority = 6;
				anims[j].leftHandItem = -1;
				anims[j].rightHandItem = -1;
				anims[j].frameStep = 99;
				anims[j].resetWhenWalk = 0;
				anims[j].priority = 0;
				anims[j].delayType = 1;
			}*/

            if (j == 5061) { //sblowpipe
                anims[5061] = new Animation();
                anims[5061].frameCount = 13;
                anims[5061].frameIDs = new int[]{19267601, 19267602, 19267603, 19267604, 19267605, 19267606, 19267607, 19267606, 19267605, 19267604, 19267603, 19267602, 19267601};
                anims[5061].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[5061].delays = new int[]{4, 3, 3, 4, 10, 10, 15, 10, 10, 4, 3, 3, 4};
                anims[5061].loopDelay = -1;
                anims[5061].animationFlowControl = new int[]{1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[5061].oneSquareAnimation = false;
                anims[5061].forcedPriority = 6;
                anims[5061].leftHandItem = 0;
                anims[5061].rightHandItem = 13438;
                anims[5061].frameStep = 99;
                anims[5061].resetWhenWalk = 0;
                anims[5061].priority = 2;
                anims[5061].delayType = 1;
            }
            if (j == 4484) {// cerberus stand
                anims[j].frameCount = 14;
                anims[j].frameIDs = new int[]{117309461, 117309547, 117309462, 117309623, 117309548, 117309621,
                        117309454, 117309599, 117309473, 117309488, 117309559, 117309541, 117309588, 117309622};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{3, 5, 7, 7, 11, 7, 7, 5, 7, 5, 6, 9, 8, 4};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            }
            if (j == 4488) { // cerberus walk
                anims[j].frameCount = 15;
                anims[j].frameIDs = new int[]{117309535, 117309468, 117309534, 117309569, 117309581, 117309507,
                        117309443, 117309598, 117309444, 117309466, 117309576, 117309551, 117309464, 117309543,
                        117309446};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            }
            if (j == 4492) { // cerberus attack
                anims[j].frameCount = 18;
                anims[j].frameIDs = new int[]{117309553, 117309490, 117309485, 117309530, 117309592, 117309531,
                        117309594, 117309583, 117309458, 117309614, 117309538, 117309524, 117309521, 117309537,
                        117309562, 117309513, 117309484, 117309616};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1};
                anims[j].delays = new int[]{7, 6, 6, 7, 9, 9, 9, 6, 6, 6, 7, 6, 6, 6, 6, 6, 6, 6};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 6;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            } // end of cerberus
            if (j == 7195) {
                anims[j].frameCount = 14;
                anims[j].frameIDs = new int[]{120193037, 120193029, 120193052, 120193080, 120193048, 120193117,
                        120193047, 120193040, 120193112, 120193025, 120193090, 120193098, 120193071, 120193067};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{4, 4, 5, 5, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 1;
            }
            if (j == 7191) {
                anims[j].frameCount = 12;
                anims[j].frameIDs = new int[]{120193116, 120193084, 120193032, 120193046, 120193045, 120193102,
                        120193068, 120193109, 120193058, 120193086, 120193038, 120193093};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 1;
            }
            if (j == 7192) { // jump
                anims[7192].frameCount = 15;
                anims[7192].frameIDs = new int[]{120193089, 120193074, 120193105, 120193063, 120193078, 120193049,
                        120193104, 120193043, 120193062, 120193054, 120193099, 120193101, 120193085, 120193030,
                        120193072};
                anims[7192].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[7192].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[7192].loopDelay = -1;
                anims[7192].animationFlowControl = null;
                anims[7192].oneSquareAnimation = false;
                anims[7192].forcedPriority = 6;
                anims[7192].leftHandItem = -1;
                anims[7192].rightHandItem = -1;
                anims[7192].frameStep = 99;
                anims[7192].resetWhenWalk = 0;
                anims[7192].priority = 0;
                anims[7192].delayType = 1;
            }
            if (j == 7193) { // poison
                anims[7193].frameCount = 24;
                anims[7193].frameIDs = new int[]{120193060, 120193057, 120193113, 120193024, 120193087, 120193031,
                        120193070, 120193094, 120193066, 120193083, 120193075, 120193026, 120193061, 120193044,
                        120193108, 120193036, 120193096, 120193107, 120193056, 120193065, 120193103, 120193027,
                        120193035, 120193053};
                anims[7193].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1, -1, -1, -1, -1, -1, -1};
                anims[7193].delays = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 11, 3, 3,
                        3};
                anims[7193].loopDelay = -1;
                anims[7193].animationFlowControl = null;
                anims[7193].oneSquareAnimation = false;
                anims[7193].forcedPriority = 6;
                anims[7193].leftHandItem = -1;
                anims[7193].rightHandItem = -1;
                anims[7193].frameStep = 99;
                anims[7193].resetWhenWalk = 0;
                anims[7193].priority = 0;
                anims[7193].delayType = 1;
            }
            if (j == 4533) { // sire
                anims[j].frameCount = 20;
                anims[j].frameIDs = new int[]{119406846, 119407068, 119407215, 119406592, 119407105, 119407099,
                        119406975, 119407198, 119407023, 119406677, 119407267, 119407258, 119407023, 119406798,
                        119406975, 119407218, 119407105, 119406977, 119407215, 119406756};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1, -1};
                anims[j].delays = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            }
            if (j == 4534) {
                anims[j].frameCount = 19;
                anims[j].frameIDs = new int[]{119406741, 119406935, 119406823, 119407208, 119406647, 119406777,
                        119406623, 119406805, 119407264, 119407008, 119406898, 119406743, 119407040, 119407253,
                        119406899, 119407138, 119406901, 119406719, 119406852};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                        -1};
                anims[j].delays = new int[]{3, 3, 4, 4, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            } // end sire
            if (j == 1828) { // thermonuclear
                anims[j].frameCount = 16;
                anims[j].frameIDs = new int[]{118095921, 118095916, 118096259, 118096320, 118096299, 118096329,
                        118096036, 118095925, 118096180, 118096105, 118096311, 118095880, 118096084, 118096269,
                        118095905, 118096227};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            }

            if (j == 1829) {
                anims[j].frameCount = 16;
                anims[j].frameIDs = new int[]{118096000, 118096073, 118095928, 118095889, 118095894, 118096223,
                        118096337, 118095979, 118096087, 118095980, 118096314, 118096202, 118095950, 118096110,
                        118096328, 118096221};
                anims[j].frameIDs2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[j].delays = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[j].loopDelay = -1;
                anims[j].animationFlowControl = null;
                anims[j].oneSquareAnimation = false;
                anims[j].forcedPriority = 5;
                anims[j].leftHandItem = -1;
                anims[j].rightHandItem = -1;
                anims[j].frameStep = 99;
                anims[j].resetWhenWalk = 0;
                anims[j].priority = 0;
                anims[j].delayType = 2;
            } // end of thermo
            if (j == 618) {
                anims[j].frameIDs = new int[]{19267634, 19267645, 19267656, 19267658, 19267659, 19267660, 19267661,
                        19267662, 19267663, 19267635, 19267636, 19267637, 19267638, 19267639, 19267640, 19267641,
                        19267642, 19267643, 19267644, 19267646, 19267647, 19267648, 19267649, 19267650, 19267651,
                        19267650, 19267649, 19267648, 19267647, 19267648, 19267649, 19267650, 19267651, 19267652,
                        19267653, 19267654, 19267655, 19267657, 19267763, 19267764, 19267765, 19267766};
            }
            if (j == 619) {
                anims[j].frameIDs = new int[]{19267664, 19267675, 19267686, 19267691, 19267692, 19267693, 19267694,
                        19267695, 19267696, 19267665, 19267666, 19267667, 19267668, 19267669, 19267670, 19267671,
                        19267672, 19267673, 19267674, 19267676, 19267677, 19267678, 19267679, 19267668, 19267669,
                        19267670, 19267671, 19267672, 19267673, 19267674, 19267676, 19267677, 19267678, 19267679,
                        19267680, 19267681, 19267682, 19267683, 19267684, 19267685, 19267687, 19267688, 19267689,
                        19267690};
            }
            if (j == 620) {
                anims[j].frameIDs = new int[]{19267697, 19267708, 19267719, 19267724, 19267725, 19267726, 19267727,
                        19267728, 19267729, 19267698, 19267699, 19267700, 19267701, 19267702, 19267703, 19267704,
                        19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267701, 19267702,
                        19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712,
                        19267713, 19267714, 19267715, 19267716, 19267717, 19267718, 19267720, 19267721, 19267722,
                        19267723};
            }
            if (j == 621) {
                anims[j].frameIDs = new int[]{19267697, 19267708, 19267719, 19267724, 19267725, 19267726, 19267727,
                        19267728, 19267729, 19267698, 19267699, 19267700, 19267701, 19267702, 19267703, 19267704,
                        19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712, 19267701, 19267702,
                        19267703, 19267704, 19267705, 19267706, 19267707, 19267709, 19267710, 19267711, 19267712,
                        19267713, 19267714, 19267715, 19267716, 19267717, 19267718, 19267720, 19267721, 19267722,
                        19267723};
            }
            if (j == 622) {
                anims[j].frameCount = 19;
                anims[j].frameIDs = new int[]{19267585, 19267586, 19267587, 19267588, 19267589, 19267590, 19267591,
                        19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267591,
                        19267592, 19267591, 19267592};
                anims[j].delays = new int[]{15, 4, 4, 4, 12, 4, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
            }
            if (j == 623) {
                anims[j].frameIDs = new int[]{19267585, 19267586, 19267587, 19267588, 19267589, 19267590, 19267591,
                        19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267592, 19267591, 19267591,
                        19267592, 19267591, 19267592};
                anims[j].delays = new int[]{15, 4, 4, 4, 12, 4, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
            }
            if (j == 7508) {
                anims[ 7508].frameCount = 16;
                anims[ 7508].frameIDs = new int[] {122355772, 122355775, 122355761, 122355820, 122355819, 122355779, 122355785, 122355730, 122355773, 122355803, 122355729, 122355766, 122355746, 122355792, 122355769, 122355723};
                anims[ 7508].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7508].delays = new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                anims[ 7508].loopDelay = -1;
                anims[ 7508].animationFlowControl = null;
                anims[ 7508].oneSquareAnimation = false;
                anims[ 7508].forcedPriority = 5;
                anims[ 7508].leftHandItem = -1;
                anims[ 7508].rightHandItem = -1;
                anims[ 7508].frameStep = 99;
                anims[ 7508].resetWhenWalk = 0;
                anims[ 7508].priority = 0;
                anims[ 7508].delayType = 2;
            }

            if (j == 7509) {
                anims[ 7509].frameCount = 15;
                anims[ 7509].frameIDs = new int[] {122355815, 122355727, 122355774, 122355787, 122355731, 122355807, 122355784, 122355810, 122355816, 122355776, 122355795, 122355744, 122355735, 122355754, 122355818};
                anims[ 7509].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7509].delays = new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[ 7509].loopDelay = -1;
                anims[ 7509].animationFlowControl = null;
                anims[ 7509].oneSquareAnimation = false;
                anims[ 7509].forcedPriority = 5;
                anims[ 7509].leftHandItem = -1;
                anims[ 7509].rightHandItem = -1;
                anims[ 7509].frameStep = 99;
                anims[ 7509].resetWhenWalk = 0;
                anims[ 7509].priority = 0;
                anims[ 7509].delayType = 2;
            }

            if (j == 7510) {
                anims[ 7510].frameCount = 16;
                anims[ 7510].frameIDs = new int[] {122355741, 122355758, 122355778, 122355793, 122355783, 122355720, 122355811, 122355755, 122355724, 122355726, 122355728, 122355738, 122355791, 122355753, 122355813, 122355759};
                anims[ 7510].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7510].delays = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[ 7510].loopDelay = -1;
                anims[ 7510].animationFlowControl = null;
                anims[ 7510].oneSquareAnimation = false;
                anims[ 7510].forcedPriority = 5;
                anims[ 7510].leftHandItem = -1;
                anims[ 7510].rightHandItem = -1;
                anims[ 7510].frameStep = 99;
                anims[ 7510].resetWhenWalk = 0;
                anims[ 7510].priority = 0;
                anims[ 7510].delayType = 2;
            }

            if (j == 7511) {
                anims[ 7511].frameCount = 12;
                anims[ 7511].frameIDs = new int[] {122355800, 122355809, 122355794, 122355743, 122355808, 122355764, 122355725, 122355740, 122355739, 122355788, 122355801, 122355749};
                anims[ 7511].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7511].delays = new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                anims[ 7511].loopDelay = -1;
                anims[ 7511].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7511].oneSquareAnimation = true;
                anims[ 7511].forcedPriority = 6;
                anims[ 7511].leftHandItem = -1;
                anims[ 7511].rightHandItem = -1;
                anims[ 7511].frameStep = 99;
                anims[ 7511].resetWhenWalk = 2;
                anims[ 7511].priority = 2;
                anims[ 7511].delayType = 2;
            }

            if (j == 7512) {
                anims[ 7512].frameCount = 16;
                anims[ 7512].frameIDs = new int[] {122355780, 122355732, 122355806, 122355756, 122355781, 122355799, 122355802, 122355790, 122355797, 122355777, 122355798, 122355745, 122355757, 122355771, 122355786, 122355752};
                anims[ 7512].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7512].delays = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
                anims[ 7512].loopDelay = -1;
                anims[ 7512].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7512].oneSquareAnimation = false;
                anims[ 7512].forcedPriority = 5;
                anims[ 7512].leftHandItem = -1;
                anims[ 7512].rightHandItem = -1;
                anims[ 7512].frameStep = 99;
                anims[ 7512].resetWhenWalk = 2;
                anims[ 7512].priority = 2;
                anims[ 7512].delayType = 2;
            }

            if (j == 7513) {
                anims[ 7513].frameCount = 32;
                anims[ 7513].frameIDs = new int[] {92012570, 92012583, 92012593, 92012600, 92012580, 92012579, 92012571, 92012585, 92012584, 92012581, 92012575, 92012574, 92012594, 92012597, 92012577, 92012592, 92012578, 92012569, 92012589, 92012599, 92012595, 92012576, 92012591, 92012573, 92012590, 92012572, 92012598, 92012596, 92012582, 92012588, 92012586, 92012587};
                anims[ 7513].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7513].delays = new int[] {14, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4};
                anims[ 7513].loopDelay = -1;
                anims[ 7513].animationFlowControl = null;
                anims[ 7513].oneSquareAnimation = false;
                anims[ 7513].forcedPriority = 5;
                anims[ 7513].leftHandItem = -1;
                anims[ 7513].rightHandItem = -1;
                anims[ 7513].frameStep = 99;
                anims[ 7513].resetWhenWalk = 0;
                anims[ 7513].priority = 0;
                anims[ 7513].delayType = 2;
            }

            if (j == 7514) {
                anims[ 7514].frameCount = 42;
                anims[ 7514].frameIDs = new int[] {122945546, 122945566, 122945570, 122945575, 122945553, 122945536, 122945552, 122945567, 122945569, 122945543, 122945541, 122945557, 122945560, 122945559, 122945544, 122945556, 122945551, 122945555, 122945573, 122945550, 122945562, 122945537, 122945545, 122945563, 122945554, 122945564, 122945547, 122945574, 122945542, 122945572, 122945539, 122945548, 122945549, 122945538, 122945571, 122945577, 122945568, 122945576, 122945561, 122945540, 122945558, 122945565};
                anims[ 7514].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7514].delays = new int[] {1, 3, 3, 3, 2, 2, 1, 1, 1, 2, 2, 3, 3, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1};
                anims[ 7514].loopDelay = -1;
                anims[ 7514].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7514].oneSquareAnimation = false;
                anims[ 7514].forcedPriority = 6;
                anims[ 7514].leftHandItem = -1;
                anims[ 7514].rightHandItem = -1;
                anims[ 7514].frameStep = 99;
                anims[ 7514].resetWhenWalk = 2;
                anims[ 7514].priority = 2;
                anims[ 7514].delayType = 2;
            }

            if (j == 7515) {
                anims[ 7515].frameCount = 11;
                anims[ 7515].frameIDs = new int[] {123076611, 123076615, 123076612, 123076613, 123076616, 123076617, 123076610, 123076618, 123076609, 123076608, 123076614};
                anims[ 7515].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7515].delays = new int[] {4, 4, 4, 4, 3, 3, 4, 4, 4, 3, 3};
                anims[ 7515].loopDelay = -1;
                anims[ 7515].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7515].oneSquareAnimation = false;
                anims[ 7515].forcedPriority = 6;
                anims[ 7515].leftHandItem = -1;
                anims[ 7515].rightHandItem = -1;
                anims[ 7515].frameStep = 99;
                anims[ 7515].resetWhenWalk = 2;
                anims[ 7515].priority = 2;
                anims[ 7515].delayType = 2;
            }

            if (j == 7516) {
                anims[ 7516].frameCount = 19;
                anims[ 7516].frameIDs = new int[] {123011122, 123011088, 123011133, 123011116, 123011113, 123011086, 123011125, 123011120, 123011092, 123011078, 123011077, 123011081, 123011074, 123011123, 123011136, 123011110, 123011102, 123011090, 123011137};
                anims[ 7516].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7516].delays = new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[ 7516].loopDelay = -1;
                anims[ 7516].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7516].oneSquareAnimation = false;
                anims[ 7516].forcedPriority = 6;
                anims[ 7516].leftHandItem = -1;
                anims[ 7516].rightHandItem = -1;
                anims[ 7516].frameStep = 99;
                anims[ 7516].resetWhenWalk = 2;
                anims[ 7516].priority = 2;
                anims[ 7516].delayType = 2;
            }

            if (j == 7517) {
                anims[ 7517].frameCount = 6;
                anims[ 7517].frameIDs = new int[] {123011130, 123011080, 123011089, 123011093, 123011108, 123011132};
                anims[ 7517].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1};
                anims[ 7517].delays = new int[] {5, 5, 5, 5, 5, 5};
                anims[ 7517].loopDelay = -1;
                anims[ 7517].animationFlowControl = new int[] {1, 2, 9, 11, 13, 15, 17, 19, 37, 39, 41, 43, 45, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 183, 185, 191, 192, 9999999};
                anims[ 7517].oneSquareAnimation = false;
                anims[ 7517].forcedPriority = 5;
                anims[ 7517].leftHandItem = -1;
                anims[ 7517].rightHandItem = -1;
                anims[ 7517].frameStep = 99;
                anims[ 7517].resetWhenWalk = 2;
                anims[ 7517].priority = 2;
                anims[ 7517].delayType = 2;
            }

            if (j == 7518) {
                anims[ 7518].frameCount = 10;
                anims[ 7518].frameIDs = new int[] {123011135, 123011106, 123011101, 123011100, 123011085, 123011094, 123011131, 123011091, 123011111, 123011103};
                anims[ 7518].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7518].delays = new int[] {12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
                anims[ 7518].loopDelay = -1;
                anims[ 7518].animationFlowControl = null;
                anims[ 7518].oneSquareAnimation = false;
                anims[ 7518].forcedPriority = 5;
                anims[ 7518].leftHandItem = -1;
                anims[ 7518].rightHandItem = -1;
                anims[ 7518].frameStep = 99;
                anims[ 7518].resetWhenWalk = 0;
                anims[ 7518].priority = 0;
                anims[ 7518].delayType = 2;
            }

            if (j == 7519) {
                anims[ 7519].frameCount = 15;
                anims[ 7519].frameIDs = new int[] {123011115, 123011105, 123011107, 123011119, 123011073, 123011124, 123011109, 123011072, 123011134, 123011082, 123011087, 123011117, 123011118, 123011099, 123011076};
                anims[ 7519].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7519].delays = new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
                anims[ 7519].loopDelay = -1;
                anims[ 7519].animationFlowControl = null;
                anims[ 7519].oneSquareAnimation = false;
                anims[ 7519].forcedPriority = 5;
                anims[ 7519].leftHandItem = -1;
                anims[ 7519].rightHandItem = -1;
                anims[ 7519].frameStep = 99;
                anims[ 7519].resetWhenWalk = 0;
                anims[ 7519].priority = 0;
                anims[ 7519].delayType = 2;
            }

            if (j == 7520) {
                anims[ 7520].frameCount = 16;
                anims[ 7520].frameIDs = new int[] {123011075, 123011095, 123011127, 123011126, 123011121, 123011098, 123011114, 123011097, 123011112, 123011083, 123011129, 123011079, 123011104, 123011096, 123011084, 123011128};
                anims[ 7520].frameIDs2 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                anims[ 7520].delays = new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
                anims[ 7520].loopDelay = -1;
                anims[ 7520].animationFlowControl = null;
                anims[ 7520].oneSquareAnimation = false;
                anims[ 7520].forcedPriority = 5;
                anims[ 7520].leftHandItem = -1;
                anims[ 7520].rightHandItem = -1;
                anims[ 7520].frameStep = 99;
                anims[ 7520].resetWhenWalk = 0;
                anims[ 7520].priority = 0;
                anims[ 7520].delayType = 2;
            }
            /*
             * Glacor anims
             */
            /*
             * if(j == 10867) { anims[j].frameCount = 19; anims[j].loopDelay =
             * 19; anims[j].delays = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
             * 5, 5, 5, 5, 5, 5, 5, 5}; anims[j].frameIDs = new int[]{244252686,
             * 244252714, 244252760, 244252736, 244252678, 244252780, 244252817,
             * 244252756, 244252700, 244252774, 244252834, 244252715, 244252732,
             * 244252836, 244252776, 244252701, 244252751, 244252743,
             * 244252685}; }
             *
             * if(j == 10901) { anims[j].frameCount = 19; anims[j].loopDelay =
             * 19; anims[j].delays = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
             * 3, 3, 3, 3, 3, 3, 3, 3}; anims[j].frameIDs = new int[]{244252826,
             * 244252833, 244252674, 244252724, 244252793, 244252696, 244252787,
             * 244252753, 244252703, 244252800, 244252752, 244252744, 244252680,
             * 244252815, 244252829, 244252769, 244252699, 244252757,
             * 244252695}; }
             */
        }
    }

    public int getFrameLength(int i) {
        if (i > delays.length)
            return 1;
        int j = delays[i];
        if (j == 0) {
            FrameReader reader = FrameReader.forID(frameIDs[i]);
            if (reader != null)
                j = delays[i] = reader.displayLength;
        }
        if (j == 0)
            j = 1;
        return j;
    }

    public void readValues(Stream stream) {
        do {
            int i = stream.readUnsignedByte();
            if (i == 0)
                break;
            if (i == 1) {
                frameCount = stream.readUnsignedWord();
                frameIDs = new int[frameCount];
                frameIDs2 = new int[frameCount];
                delays = new int[frameCount];
                for (int i_ = 0; i_ < frameCount; i_++) {
                    frameIDs[i_] = stream.readDWord();
                    frameIDs2[i_] = -1;
                }
                for (int i_ = 0; i_ < frameCount; i_++)
                    delays[i_] = stream.readUnsignedByte();
            } else if (i == 2)
                loopDelay = stream.readUnsignedWord();
            else if (i == 3) {
                int k = stream.readUnsignedByte();
                animationFlowControl = new int[k + 1];
                for (int l = 0; l < k; l++)
                    animationFlowControl[l] = stream.readUnsignedByte();
                animationFlowControl[k] = 0x98967f;
            } else if (i == 4)
                oneSquareAnimation = true;
            else if (i == 5)
                forcedPriority = stream.readUnsignedByte();
            else if (i == 6)
                leftHandItem = stream.readUnsignedWord();
            else if (i == 7)
                rightHandItem = stream.readUnsignedWord();
            else if (i == 8)
                frameStep = stream.readUnsignedByte();
            else if (i == 9)
                resetWhenWalk = stream.readUnsignedByte();
            else if (i == 10)
                priority = stream.readUnsignedByte();
            else if (i == 11)
                delayType = stream.readUnsignedByte();
            else
                System.out.println("Unrecognized seq.dat config code: " + i);
        } while (true);
        if (frameCount == 0) {
            frameCount = 1;
            frameIDs = new int[1];
            frameIDs[0] = -1;
            frameIDs2 = new int[1];
            frameIDs2[0] = -1;
            delays = new int[1];
            delays[0] = -1;
        }
        if (resetWhenWalk == -1)
            if (animationFlowControl != null)
                resetWhenWalk = 2;
            else
                resetWhenWalk = 0;
        if (priority == -1) {
            if (animationFlowControl != null) {
                priority = 2;
                return;
            }
            priority = 0;
        }
    }

    private Animation() {
        loopDelay = -1;
        oneSquareAnimation = false;
        forcedPriority = 5;
        leftHandItem = -1;
        rightHandItem = -1;
        frameStep = 99;
        resetWhenWalk = -1;
        priority = -1;
        delayType = 2;
    }

    public static Animation[] anims;
    public int frameCount;
    public int[] frameIDs;
    public int[] frameIDs2;
    public int[] delays;
    public int loopDelay;
    public int[] animationFlowControl;
    public boolean oneSquareAnimation;
    public int forcedPriority;
    public int leftHandItem;
    public int rightHandItem;
    public int frameStep;
    public int resetWhenWalk;
    public int priority;
    public int delayType;
    public static int anInt367;
}