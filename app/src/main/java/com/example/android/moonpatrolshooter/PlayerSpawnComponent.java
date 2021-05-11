package com.example.android.moonpatrolshooter;

class PlayerSpawnComponent implements SpawnComponent {

    static final float PLAYER_Y_POS = 750.0f;

    @Override
    public void spawn(Transform playerTransform, Transform t) {

        // Spawn in the centre with vertical height on ground
        t.setLocation(
                t.getmScreenSize().x/2,
                PLAYER_Y_POS);
    }
}
