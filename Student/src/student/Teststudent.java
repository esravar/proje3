/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author esra
 */
public class Teststudent {
	public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.age);
        System.out.println(s.name);
        
        s.age = 15; 
        s.name = "Mehmet";
        s.gender = 'M';
        s.isJunior = true;
        
        System.out.println(s.age);
        System.out.println(s.name);

	}


}
