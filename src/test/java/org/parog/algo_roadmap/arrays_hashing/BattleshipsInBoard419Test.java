package org.parog.algo_roadmap.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link BattleshipsInBoard419}
 */
public class BattleshipsInBoard419Test {

    @Test
    void BattleshipsInBoard419Test1() {
        assertThat(BattleshipsInBoard419.countBattleships(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}})).isEqualTo(2);
    }

    @Test
    void BattleshipsInBoard419Test2() {
        assertThat(BattleshipsInBoard419.countBattleships(new char[][]{
                {'.'}})).isEqualTo(0);
    }
}
