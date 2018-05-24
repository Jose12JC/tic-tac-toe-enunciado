package es.codeurjc.ais.tictactoe;

import static org.junit.Assert.*;
import es.codeurjc.ais.tictactoe.TicTacToeGame.Cell;


import org.junit.Test;

public class TestUnitarios {

	@Test
	public void checkWinnerTest() {
		int[] solucion={1,4,7};
	    Board board = new Board();
		Player jose = new Player(1, "jc", "jose");
		
		Cell cell0=board.getCell(0);
		cell0.value="O";
		Cell cell1=board.getCell(1);
		cell1.value="X";
		Cell cell2=board.getCell(2);
		cell2.value="X";
		Cell cell3=board.getCell(3);
		cell3.value="X";
		Cell cell4=board.getCell(4);
		cell4.value="X";
		Cell cell5=board.getCell(5);
		cell5.value="O";
		Cell cell6=board.getCell(6);
		cell6.value="O";
		Cell cell7=board.getCell(7);
		cell7.value="X";
		Cell cell8=board.getCell(8);
		cell8.value="X";
		int [] boarSolucion = board.getCellsIfWinner("X");
		assertArrayEquals(boarSolucion,solucion);
		
		
		
		
		
		
		
	}
	@Test
	public void checkDrawTest() {
		//Comprobamos que si estan todas las cell marcadas
		//te devuelva true
		Board board = new Board();
		Cell cell0=board.getCell(0);
		cell0.value="O";
		Cell cell1=board.getCell(1);
		cell1.value="X";
		Cell cell2=board.getCell(2);
		cell2.value="O";
		Cell cell3=board.getCell(3);
		cell3.value="X";
		Cell cell4=board.getCell(4);
		cell4.value="O";
		Cell cell5=board.getCell(5);
		cell5.value="X";
		Cell cell6=board.getCell(6);
		cell6.value="O";
		Cell cell7=board.getCell(7);
		cell7.value="X";
		Cell cell8=board.getCell(8);
		cell8.value="O";
		assertTrue(board.checkDraw());
		
		//Comprobamos que si hay alguna celda que no este marcada
		//devuelva false
		Board board1 = new Board();
		Cell cell01=board1.getCell(0);
		cell01.value="O";
		Cell cell11=board1.getCell(1);
		cell11.value="X";
		Cell cell21=board1.getCell(2);
		cell21.value="O";
		Cell cell31=board1.getCell(3);
		cell31.value="X";
		Cell cell41=board1.getCell(4);
		cell41.value="O";
		Cell cell51=board1.getCell(5);
		cell51.value="X";
		Cell cell61=board1.getCell(6);
		cell61.value="O";
		Cell cell71=board1.getCell(7);
		cell71.value="X";
		assertFalse(board1.checkDraw());
		
	}
	

}