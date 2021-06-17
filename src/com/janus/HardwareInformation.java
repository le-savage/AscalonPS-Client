package com.janus;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nick Hartskeerl <apachenick@hotmail.com>
 */
public class HardwareInformation {

    private static final SystemInfo systemInfo = new SystemInfo();

    private static final HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();

    private static final CentralProcessor centralProcessor = hardwareAbstractionLayer.getProcessor();

    static String getSerialNumber() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("wmic", "baseboard",
                "get", "serialnumber");
        Process process = pb.start();
        process.waitFor();
        String serialNumber = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                process.getInputStream()))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                if (line.length() < 1 || line.startsWith("SerialNumber")) {
                    continue;
                }
                serialNumber = line;
                break;
            }
        }
        return serialNumber;
    }

}
