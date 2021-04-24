/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexcercises;

/**
 *
 * @author Asus
 */
class Account implements Cloneable {
	String type;
	String owner;

	Account(String owner,String type) {
		this.owner = owner;
		this.type = type;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void usage() {
		if (this.type == "Corporation") {
			System.out.println(this.owner + " Corporation: The corporation account is open");
		} 
                else if (this.type == "Individual") {
			System.out.println(this.owner + "'s Account: The individual account is open");
		}
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} 
                catch (CloneNotSupportedException e) {
			return e.getMessage();
		}
	}
}

class Corporation extends Account {
	String owner;
	public Corporation(String owner) {
		super(owner,"Corporation");
		
	}

}

class Individual extends Account {
	String owner;
	public Individual(String owner) {
		super(owner,"Individual");
	}

}

public class Test {
	public static void main(String[] args) {
		Corporation corporationAccount = new Corporation("ABC");
		Individual individualAccount = new Individual("Mr. Black");
		Account[]arr = {corporationAccount ,individualAccount};
		arr[0].usage();
		arr[1].usage();
	}
}