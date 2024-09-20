package org.bordomey.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.bordomey.task3.Engineers;
import org.bordomey.task3.Machine;
import org.bordomey.task3.Starship;



import static org.junit.jupiter.api.Assertions.*;

/*
Еще они не могли примириться с постоянными неудачами, постигавшими их при попытках построить аппарат,
который мог бы генерировать поле бесконечной невероятности, необходимое,
чтобы перенести космический корабль через непостижимые уму расстояния между самыми дальними звездами.
В конце концов, они мрачно заявили, что создать такой аппарат практически невозможно.

*/


public class TestTask3 {
    @Nested
    class TestStarship {
        private Engineers team;
        private Machine uiMachine,  badEngine, mediocreEngine;
        private Starship starship;


        @BeforeEach
        void setUp() throws Exception {
            team = new Engineers(false, 2);
            uiMachine = new Machine(100);
            badEngine = new Machine(2);
            mediocreEngine = new Machine(4);
            starship = new Starship(uiMachine);
        }


        @Test
        @DisplayName("Check giving up")
        void checkGiveUp() throws Exception {
            team.canBuild(uiMachine);
            assertFalse(team.canGiveUp());

        }
        @Test
        @DisplayName("Check building")
        void checkBuild() throws Exception {
            assertFalse(team.canBuild(uiMachine));
        }
        @Test
        @DisplayName("Check starship")
        void checkShip() throws Exception {
            assertTrue(starship.isFastEnough());
        }
        @Test
        @DisplayName("Check engineers")
        void checkEngineers() throws Exception{
            assertTrue(team.canBuild(badEngine));
        }
        @Test
        @DisplayName("Check possibility")
        void checkPossibility() throws Exception {
            assertNotEquals(1, team.estimateProbability(uiMachine));
            assertNotEquals(0, team.estimateProbability(uiMachine));
        }
        @Test
        @DisplayName("Vibecheck)")
        void checkVibes() throws Exception {
            assertEquals("Инженеры мрачно сообщили о прогрессе", team.describeProgress(uiMachine));
            assertEquals("Инженеры нейтрально сообщили о прогрессе", team.describeProgress(mediocreEngine));
            assertEquals("Инженеры весело сообщили о прогрессе", team.describeProgress(badEngine));
        }
    }
}
