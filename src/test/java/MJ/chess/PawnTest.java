package MJ.chess;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

public class PawnTest {

    @Test
    @DisplayName("흰색 폰 생성")
    public void create_pawn_check_color_white() {
        Pawn pawn = new Pawn(Color.WHITE);
        assertThat(pawn.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    @DisplayName("검은색 폰 생성")
    public void create_pawn_check_color_balck() {
        Pawn pawn = new Pawn(Color.BLACK);
        assertThat(pawn.getColor()).isEqualTo(Color.BLACK);
    }



}
