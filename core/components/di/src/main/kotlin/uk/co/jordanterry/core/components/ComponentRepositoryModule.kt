package uk.co.jordanterry.core.components

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.co.jordanterry.core.components.network.StubbedComponentRepository

@Module
@InstallIn(SingletonComponent::class)
public interface ComponentRepositoryModule {
    @Binds
    public fun bindsComponentRepository(
        stubbedComponentRepository: StubbedComponentRepository
    ): ComponentRepository
}