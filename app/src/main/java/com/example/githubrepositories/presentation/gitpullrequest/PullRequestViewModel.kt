package com.example.githubrepositories.presentation.gitpullrequest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubrepositories.data.repository.Repository
import com.example.githubrepositories.domain.mapper.toModel
import com.example.githubrepositories.domain.model.ItemModel
import com.example.githubrepositories.domain.model.PullRequestItemModel
import kotlinx.coroutines.launch

class PullRequestViewModel : ViewModel() {

    private val repository = Repository()

    private val resultMutableLiveData: MutableLiveData<List<PullRequestItemModel>> = MutableLiveData()

    val resultLiveData: LiveData<List<PullRequestItemModel>> = resultMutableLiveData

    fun getAllPullRequestOfRepository(criador: String, dxgsfdfhf: String) {
        viewModelScope.launch {
            val result = repository.getAllPullRequestOfRepository(criador = criador, repositorio = dxgsfdfhf)
            resultMutableLiveData.postValue(result as List<PullRequestItemModel>?)
        }
    }
}
