package io.github.jan.supabase.gotrue

import co.touchlab.kermit.Logger
import io.github.jan.supabase.annotiations.SupabaseInternal

@SupabaseInternal
actual fun GoTrue.setupPlatform() {
    Logger.w { "IOS support is experimental, please report any bugs you find!" }
}