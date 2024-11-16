package uk.co.jordanterry.squares.components

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import uk.co.jordanterry.core.components.ComponentRepository
import uk.co.jordanterry.core.components.Screen
import javax.inject.Inject

@HiltViewModel
class ComponentViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    componentRepository: ComponentRepository,
) : ViewModel() {
    private val screen = savedStateHandle.toRoute<Screen>()

    private val loading: uk.co.jordanterry.core.components.Layout =
        uk.co.jordanterry.core.components.Layout.SingleColumnList(
            components = listOf(
                uk.co.jordanterry.core.components.Component.Text.Small("Loading..."),
            )
        )
    private val _layout: Flow<uk.co.jordanterry.core.components.Layout> = flow {
        emit(componentRepository.get(screen))
    }
    val state: StateFlow<uk.co.jordanterry.core.components.Layout> = _layout
        .stateIn(viewModelScope, SharingStarted.Eagerly, loading)
}
