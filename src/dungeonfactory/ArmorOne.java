/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonfactory;

import javax.swing.ImageIcon;

/**
 *
 * @author Seth, Icon, Marco
 */
public class ArmorOne extends ItemDecorator{
    Item item;
    String name = "Iron Armor";
    String description = "Standard Iron Armor";
    int atk = 0;
    int def = 1;
    int hp = 5;
    
    public ArmorOne() {
        
    }

    public ArmorOne(ItemDecorator id) {
        super(id);
    }

    @Override
    public int atk() {
        return item.getAtk() + atk;
    }

    @Override
    public int def() {
        return item.getDef() + def;
    }

    @Override
    public int hp() {
        return item.getHP() + hp;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public int getAtk() {
        return atk;
    }
    
    @Override
    public int getDef() {
        return def;
    }
    
    @Override
    public int getHP(){
        return hp;
    }
    
    
}