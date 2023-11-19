package com.example.hiltuse.di

import com.example.hiltuse.hilt.Engine
import com.example.hiltuse.hilt.GasEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class EnginModule {

    @Binds
    abstract fun bindEngin(gasEngine: GasEngine): Engine
    //@Binds 注释会告知Hilt在需要提供接口的实例时要使用哪种实现。
    //@Binds告知 需要提供 Engin接口的实例是有该抽象方法的参数类型对象提供，所以GasEngine需要实现Engine接口
}