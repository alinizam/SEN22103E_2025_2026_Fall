/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Lab;

/**
 *
 * @author ali.nizam
 */
public class Role {
    String name;
    static Role [] roles={new Role("Staff"),new Role("CIO"),new Role("Asistant")};

    public Role(String name) {
        this.name = name;
    }
    
}
