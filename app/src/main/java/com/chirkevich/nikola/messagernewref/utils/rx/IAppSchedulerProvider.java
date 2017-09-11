package com.chirkevich.nikola.messagernewref.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by Колян on 11.09.2017.
 */

public interface IAppSchedulerProvider {
    Scheduler ui();
    Scheduler computation();
    Scheduler io();
}
