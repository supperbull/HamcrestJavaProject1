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
		char table[][] = {{'X', 'O', 'X'},
				{'X', 'O', 'O'},
				{'O', 'X', 'O'}};
		int cos=kolkoKrzyzyk.checkResult(table);
		assertThat(0,equalTo(cos));
	}
	@Test
	public void ifItsWinPlayerX() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'X'},
				{'X', 'O', 'O'},
				{'X', ' ', ' '}};
		int cos=kolkoKrzyzyk.checkResult(table);
		assertThat(1,is(cos));
	}
	@Test
	public void ifItsWinPlayerO() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{'O', ' ', ' '}};
		int cos=kolkoKrzyzyk.checkResult(table);
		assertThat(1,is(cos));
	}
	@Test
	public void ifItsBadtMovePlayerOne() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{' ', ' ', ' '}};
		boolean badmove = kolkoKrzyzyk.user_oneMove(table,"a1");
		assertThat(true, is(not(equalTo(badmove))));
	}
	@Test
	public void ifItsCorrectMovePlayerOne() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'O'},
				{'X', ' ', ' '},
				{' ', ' ', 'X'}};
		boolean goodmove = kolkoKrzyzyk.user_oneMove(table,"b2");
		assertThat(true,is(equalTo(goodmove)));
	}

	@Test
	public void ifItsBadtMovePlayerTwo() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'O'},
				{'X', 'O', 'X'},
				{' ', ' ', ' '}};
		boolean badmove = kolkoKrzyzyk.user_twoMove(table,"a1");
		assertThat(true, is(not(equalTo(badmove))));
	}
	@Test
	public void ifItsCorrectMovePlayerTwo() throws Exception {
		KolkoKrzyzyk kolkoKrzyzyk = new KolkoKrzyzyk();
		char table[][] = {{'X', 'O', 'O'},
				{'X', ' ', ' '},
				{' ', ' ', 'X'}};
		boolean goodmove = kolkoKrzyzyk.user_twoMove(table,"b2");
		assertThat(true,is(equalTo(goodmove)));
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
