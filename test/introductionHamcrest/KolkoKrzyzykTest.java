package introductionHamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import introductionHamcrest.KolkoKrzyzyk;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KolkoKrzyzykTest {
	
	private KolkoKrzyzyk array;

	@Before
	public void setUp() throws Exception {
		array = new KolkoKrzyzyk();
		char table[][] = {{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}};
		boolean user_one = true;
	}



	@Test
	public void ifItsDraw() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table1[][] = {{'X', 'O', 'X'},
				{'X', 'O', 'O'},
				{'O', 'X', 'O'}};
		int cos=kolkoKrzyzyk.checkResult(table1,"O");
		assertThat(0,equalTo(cos));
	}
	@Test
	public void ifItsWinPlayerX() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table2[][] = {{'X', 'O', 'X'},
				{'X', 'O', 'O'},
				{'X', ' ', ' '}};
		int cos=kolkoKrzyzyk.checkResult(table2,"X");
		assertThat(1,is(cos));
	}
	@Test
	public void ifItsWinPlayerO() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table3[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{'O', ' ', ' '}};
		int cos=kolkoKrzyzyk.checkResult(table3,"O");
		assertThat(2,is(cos));
	}
	@Test
	public void ifItsBadtMovePlayerOne() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table4[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{' ', ' ', ' '}};
		boolean badmove = kolkoKrzyzyk.user_oneMove(table4,"a1");
		assertThat(true, is(not(equalTo(badmove))));
	}
	@Test
	public void ifItsCorrectMovePlayerOne() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table5[][] = {{'X', 'O', 'O'},
				{'X', ' ', ' '},
				{' ', ' ', 'X'}};
		boolean goodmove = kolkoKrzyzyk.user_oneMove(table5,"b2");
		assertThat(true,is(equalTo(goodmove)));
	}

	@Test
	public void ifItsBadtMovePlayerTwo() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table6[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{' ', ' ', ' '}};
		boolean badmove = kolkoKrzyzyk.user_twoMove(table6, "a1");
		assertThat(true, is(not(equalTo(badmove))));
	}
	@Test
	public void ifItsCorrectMovePlayerTwo() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table7[][] = {{'X', 'O', 'O'},
				{'X', ' ', ' '},
				{' ', ' ', 'X'}};
		boolean goodmove = kolkoKrzyzyk.user_twoMove(table7, "b2");
		assertThat(true,is(equalTo(goodmove)));
	}
	@Test
	public void ifItsCrossWin() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table8[][] = {{'X', 'O', 'O'},
				{'O', 'X', ' '},
				{'O', ' ', 'X'}};
		int crossmove = kolkoKrzyzyk.checkResult(table8,"X");
		assertThat(1,equalTo(crossmove));
	}@Test
	 public void ifItsCrossRevertWin() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table9[][] = {{'O', 'O', 'X'},
				{'O', 'X', 'O'},
				{'X', ' ', 'X'}};
		int crossmove = kolkoKrzyzyk.checkResult(table9,"X");
		assertThat(1,equalTo(crossmove));
	}
	@Test
	public void ifItsStraightWin() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table11[][] = {{' ', 'X', 'O'},
				{' ', 'X', ' '},
				{'O', 'X', 'O'}};
		int straightmove = kolkoKrzyzyk.checkResult(table11,"X");
		assertThat(1, equalTo(straightmove));
	}

	@Test
	public void ifItsCrossWin2() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table22[][] = {{'O', 'X', ' '},
				{'X', 'O', 'X'},
				{' ', ' ', 'O'}};
		int crossmove = kolkoKrzyzyk.checkResult(table22,"O");
		assertThat(2,equalTo(crossmove));
	}@Test
	 public void ifItsCrossRevertWin2() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table33[][] = {{' ', 'X', 'O'},
				{' ', 'O', 'X'},
				{'O', ' ', 'X'}};
		int crossmove = kolkoKrzyzyk.checkResult(table33,"O");
		assertThat(2,equalTo(crossmove));
	}
	@Test
	public void ifItsStraightWin2() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table44[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{' ', 'O', ' '}};
		int straightmove = kolkoKrzyzyk.checkResult(table44,"O");
		assertThat(2, equalTo(straightmove));
	}

	@After
	public void tearDown() throws Exception {
		array = null;
		char table[][] = {{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}};
		boolean user_one = true;
	}
	
}
