package J13_Recording.poi;

import java.util.Scanner;

public class PoiSystem {
    static Scanner sc = new Scanner(System.in);
    public static Map map = new Map();
    public static SatelliteMap satelliteMap = new SatelliteMap();
    public static Poi[] pois = {
            new Poi("Langham Place", "22.31849342743704", "114.16869952883643"),
            new Poi("Avenue of stars", "22.29323411864203", "114.17418557969665"),
            new Poi("Statue of Liberty National Monument", "40.68943648893484", "-74.04453258765587"),
            new Poi("Arc de Triomphe", "48.87389047115137", "2.295038227851929")
    };

    public static void main(String[] args) {
        mapList();
        menu();
    }

    public static void mapList() {
        for (int i = 0; i < pois.length; i++) {
            System.out.println("[" + (i + 1) + "] " + pois[i].toString());
        }
        System.out.println();
    }

    public static void menu() {
        while (true) {
            System.out.print("Input a sequence number: ");
            String sequence = sc.nextLine();

            if (sequence.matches("\\d+<\\d+") || sequence.matches("\\d+>\\d+")) {
                splitString(sequence);
            } else if (sequence.matches("\\d+")) {
                int num = Integer.parseInt(sequence);

                if (num < 1 || num > pois.length) {
                    System.out.println("Invalid input.");
                    System.out.println();
                } else {
                    System.out.print("Input a zoom level (1-21): ");
                    String zoom = sc.nextLine();

                    if (zoom.matches("\\d+")) {
                        int zoomLevel = Integer.parseInt(zoom);

                        if (zoomLevel < 1 || zoomLevel > 21) {
                            System.out.println("Invalid input");
                            System.out.println();
                        } else {
                            label:
                            while (true) {
                                System.out.print("Choose a map type (“map” or “satellite”): ");
                                String choice = sc.nextLine();

                                switch (choice) {
                                    case "map", "satellite":
                                        showMap(choice, num, zoomLevel);
                                        break label;
                                    case "quit":
                                        System.out.println("Bye~");
                                        return;
                                    default:
                                        System.out.println("Invalid input.");
                                        System.out.println();
                                        break;
                                }
                            }
                        }
                    } else if (zoom.equals("quit")) {
                        System.out.println("Bye~");
                        return;
                    } else {
                        System.out.println("Invalid input");
                        System.out.println();
                    }
                }
            } else if (sequence.equals("quit")) {
                System.out.println("Bye~");
                break;
            } else {
                System.out.println("Invalid input.");
                System.out.println();
            }
        }
    }

    public static void splitString(String sequence) {
        try {
            if (sequence.matches("\\d+<\\d+")) {
                String[] direction = sequence.split("<");
                int i = Integer.parseInt(direction[1]);
                int j = Integer.parseInt(direction[0]);
                System.out.println(map.getDirection(pois[i - 1], pois[j - 1]));
            } else if (sequence.matches("\\d+>\\d+")) {
                String[] direction = sequence.split(">");
                int i = Integer.parseInt(direction[0]);
                int j = Integer.parseInt(direction[1]);
                System.out.println(map.getDirection(pois[i - 1], pois[j - 1]));
            }
        } catch (Exception ignored) {
            System.out.println("Invalid input.");
            System.out.println();
        }
    }

    public static void showMap(String choice, int num, int zoomLevel) {

        if (choice.equals("map")) {
            map.setZoomLevel(zoomLevel);
            System.out.println("The Google Map link to " + pois[num - 1].getName() + ":");
            System.out.println(map.getLink(pois[num - 1]));
            System.out.println();
        } else if (choice.equals("satellite")) {
            satelliteMap.setZoomLevel(zoomLevel);
            System.out.println("The Google Map link to " + pois[num - 1].getName() + ":");
            System.out.println(satelliteMap.getLink(pois[num - 1]));
            System.out.println();
        }

    }
}
