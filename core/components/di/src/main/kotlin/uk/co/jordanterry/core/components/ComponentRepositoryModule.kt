package uk.co.jordanterry.core.components

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uk.co.jordanterry.core.components.network.StubbedComponentRepository

@Module
@InstallIn(ViewModelComponent::class)
interface ComponentRepositoryModule {
    @Binds
    fun bindsComponentRepository(
        stubbedComponentRepository: StubbedComponentRepository
    ): ComponentRepository
}