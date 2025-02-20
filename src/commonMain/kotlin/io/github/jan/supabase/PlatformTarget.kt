package io.github.jan.supabase

/**
 * Represents a target platform
 */
enum class PlatformTarget {
    DESKTOP, ANDROID, WEB, IOS;
}

/**
 * The current target platform
 */
expect val CurrentPlatformTarget: PlatformTarget