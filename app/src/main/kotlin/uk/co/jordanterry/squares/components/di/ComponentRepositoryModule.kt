package uk.co.jordanterry.squares.components.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uk.co.jordanterry.squares.components.ComponentRepository
import uk.co.jordanterry.squares.components.StubbedComponentRepository

@Module
@InstallIn(ViewModelComponent::class)
interface ComponentRepositoryModule {
    @Binds
    fun bindsComponentRepository(
        stubbedComponentRepository: StubbedComponentRepository
    ): ComponentRepository
}