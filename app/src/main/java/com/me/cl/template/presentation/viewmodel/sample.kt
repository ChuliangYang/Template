package com.me.cl.template.presentation.viewmodel
//todo add viewmodel and remove sample code
//class CityListViewModel @Inject constructor(private val repository: CityRepository) : BaseViewModel(repository) {
//    fun getTwoCityList(): LiveData<DataResource<Array<List<City>>>> {
//        return reuseWhenAlive {
//            Transformations.switchMap(repository.cities) { input ->
//                input.original?.let {
//                    repository.divideIntoTwoList(it)
//                } ?: let {
//                    NullLiveData.create<DataResource<Array<List<City>>>>()
//                }
//            }
//        }
//    }
//
//    fun getTitle(): LiveData<DataResource<String>> {
//        return reuseWhenAlive("test") {
//            repository.getTitle()
//        }
//    }
//}