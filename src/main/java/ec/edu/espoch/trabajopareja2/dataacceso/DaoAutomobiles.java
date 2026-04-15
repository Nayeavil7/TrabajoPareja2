/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.trabajopareja2.dataacceso;

/**
 *
 * @author HP
 */
public interface DaoAutomobiles {
    public void accelerate(int speedIncrease);
    public void decelerate(int speedDecrease);
    public void brake();
    public double calculateArrivalTime(double distance);
    public void print();
}
