package com.example.android.moonpatrolshooter;

interface MovementComponent {

    boolean move(long fps,
                 Transform t,
                 Transform playerTransform);
}
