/*
 * Created on 24/apr/2010
 *
 * Copyright 2010 by Andrea Vacondio (andrea.vacondio@gmail.com).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package org.sejda.core.notification.context;

import java.util.List;

import org.sejda.core.notification.EventListener;
import org.sejda.core.notification.event.AbstractNotificationEvent;
import org.sejda.core.support.ListValueMap;

/**
 * Holds a list of listeners as a property.
 * 
 * @author Andrea Vacondio
 * 
 */
class SimpleEventListenerHoldingStrategy implements EventListenerHoldingStrategy {

    private final ListValueMap<Class<? extends AbstractNotificationEvent>, EventListener<? extends AbstractNotificationEvent>> listeners;

    SimpleEventListenerHoldingStrategy() {
        listeners = new ListValueMap<Class<? extends AbstractNotificationEvent>, EventListener<? extends AbstractNotificationEvent>>();
    }

    public void add(Class<? extends AbstractNotificationEvent> eventClass,
            EventListener<? extends AbstractNotificationEvent> listener) {
        listeners.put(eventClass, listener);
    }

    public void clear() {
        listeners.clear();
    }

    public List<EventListener<? extends AbstractNotificationEvent>> get(AbstractNotificationEvent event) {
        return listeners.get(event.getClass());
    }

    public int size() {
        return listeners.size();
    }

}
