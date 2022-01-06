package handOuts;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
//code to read values
//code to call required method
//code to display the result
        Scanner scan = new Scanner(System.in);
        Player[] player = new Player[4];
        for (int i = 0; i < 4; i++) {
            int id = scan.nextInt();
            scan.nextLine();
            String country = scan.nextLine();
            String side = scan.nextLine();
            double price = scan.nextDouble();

            player[i] = new Player(id, country, side, price);
        }

        scan.nextLine();
        String playerForMach = scan.nextLine();

        Player[] players = searchPlayerForMatch(playerForMach, player);


        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println(players[i].id);
            }

        }


    }

    public static Player[] searchPlayerForMatch(String search, Player[] players) {
//method logic
        Player[] re = new Player[players.length];

        for (int i = 0; i < players.length; i++) {
            if (players[i].side.equals(search)) {
                re[i] = new Player(players[i].id, players[i].country, players[i].side, players[i].price);
            }
        }

        return re;
    }
}

class Player {
    //code to build Player class
    int id;
    String country;
    String side;
    double price;

    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

