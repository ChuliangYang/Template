package com.me.cl.template.presentation.repos

//todo add repo and remove sample code
//class CityRepository @Inject constructor(val cityDao:CityDao, val gistService:GistService): RxReopsitory() {
//    val title = MutableLiveData<DataResource<String>>()
//    val cities: LiveData<DataResource<List<City>>>
//        get() {
//            return object : RemoteSource<List<City>>() {
//                override fun obtainFromLocal(): LiveData<List<City>> {
//                    return cityDao.getAll()
//                }
//
//                override fun needFetch(data: List<City>?): Boolean {
//                    return data==null||data.isEmpty()
//                }
//
//                override fun obtainFromRemote(): LiveData<NetworkResponse<List<City>>> {
//                    return gistService.getCityListLive()
//                }
//
//                override fun saveRemoteResult(result: List<City>?) {
//                    result?.let {
//                        cityDao.insertCities(result)
//                    }
//                }
//            }.toLiveData()
//        }
//
//    fun divideIntoTwoList(totalList: List<City>): LiveData<DataResource<Array<List<City>>>> {
//        return ReactUtil.toLiveDataResource {
//            val listOne = mutableListOf<City>()
//            val listTwo = mutableListOf<City>()
//
//            totalList.forEach {
//                if (it.rank.toInt() < 500) {
//                    listOne.add(it)
//                } else {
//                    listTwo.add(it)
//                }
//            }
//            arrayOf(listOne,listTwo) as Array<List<City>>
//        }
//    }
//
//    fun getTitle(): LiveData<DataResource<String>> {
//        title.value = DataResource.success("test title")
//        autoDispose(Observable.interval(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe {
//            title.value = DataResource.success("test title${it}")
//        })
//        return title
//    }
//}