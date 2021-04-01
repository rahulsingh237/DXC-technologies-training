package com.dxc.spack;
import com.dxc.ppack.*;

public class Stadium {

	public static void main(String[] args) {
		Player p1 = new Player("Rahul");
		Player p2 = new Player("Aditi");
		
		int p1score=p1.play() ;
		int p2score=p2.play() ;
		
		if(p1score>p2score)
		{
			System.out.println("Player 1 win");
		}
		else {
			if(p1score==p2score)
			{
				System.out.println("Draw");
			}else {
			System.out.println("Player 2 wins");
			}
		}
	}

}
