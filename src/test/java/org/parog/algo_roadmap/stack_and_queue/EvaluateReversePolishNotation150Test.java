package org.parog.algo_roadmap.stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для задачи {@link EvaluateReversePolishNotation150}
 */
public class EvaluateReversePolishNotation150Test {
    @Test
    void evaluateReversePolishNotation150Test1() {
        assertThat(EvaluateReversePolishNotation150.evalRPN(new String[]{"2", "1", "+", "3", "*"}))
                .isEqualTo(9);
    }

    @Test
    void evaluateReversePolishNotation150Test2() {
        assertThat(EvaluateReversePolishNotation150.evalRPN(new String[]{"4","13","5","/","+"}))
                .isEqualTo(6);
    }

    @Test
    void evaluateReversePolishNotation150Test3() {
        assertThat(EvaluateReversePolishNotation150.evalRPN(new String[]{"2", "1", "+", "3", "*"}))
                .isEqualTo(9);
    }

    @Test
    void evaluateReversePolishNotation150Test4() {
        assertThat(EvaluateReversePolishNotation150.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}))
                .isEqualTo(22);
    }
}
