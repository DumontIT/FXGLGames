package com.almasb.fxglgames.spaceinvaders;

import com.almasb.fxgl.gameplay.Achievement;
import com.almasb.fxgl.gameplay.AchievementManager;
import com.almasb.fxgl.gameplay.AchievementStore;
import com.almasb.fxgl.gameplay.SetAchievementStore;

import static com.almasb.fxglgames.spaceinvaders.Config.ACHIEVEMENT_ENEMIES_KILLED;
import static com.almasb.fxglgames.spaceinvaders.Config.ACHIEVEMENT_MASTER_SCORER;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
@SetAchievementStore
public class Achievements implements AchievementStore {

    @Override
    public void initAchievements(AchievementManager am) {
        am.registerAchievement(new Achievement("Hitman", "Destroy " + ACHIEVEMENT_ENEMIES_KILLED + " enemies", "enemiesKilled", ACHIEVEMENT_ENEMIES_KILLED));
        am.registerAchievement(new Achievement("Master Scorer", "Score " + ACHIEVEMENT_MASTER_SCORER + " points", "score", ACHIEVEMENT_MASTER_SCORER));
    }
}
