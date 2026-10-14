package org.parog.algo_roadmap.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link RobotReturnToOrigin657}
 */
public class RobotReturnToOrigin657Test {
    @Test
    void RobotReturnToOrigin657Test1() {
        assertThat(RobotReturnToOrigin657.judgeCircleV1("U")).isFalse();
    }

    @Test
    void RobotReturnToOrigin657Test2() {
        assertThat(RobotReturnToOrigin657.judgeCircleV1("UD")).isTrue();
    }

    @Test
    void RobotReturnToOrigin657Test3() {
        assertThat(RobotReturnToOrigin657.judgeCircleV2("LL")).isFalse();
    }

    @Test
    void RobotReturnToOrigin657Test4() {
        assertThat(RobotReturnToOrigin657.judgeCircleV2("LRUD")).isTrue();
    }
}
