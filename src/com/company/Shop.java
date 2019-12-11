package com.company;

public class Shop {
    void upgrade(Player player)
    {
        player.setHealth(player.getHealth()+20);
        player.setDmg(player.getDmg()+2);
    }
}
