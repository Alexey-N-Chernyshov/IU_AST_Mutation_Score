/*
 * Joda Software License, Version 1.0
 *
 *
 * Copyright (c) 2001-2004 Stephen Colebourne.  
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Joda project (http://www.joda.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The name "Joda" must not be used to endorse or promote products
 *    derived from this software without prior written permission. For
 *    written permission, please contact licence@joda.org.
 *
 * 5. Products derived from this software may not be called "Joda",
 *    nor may "Joda" appear in their name, without prior written
 *    permission of the Joda project.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE JODA AUTHORS OR THE PROJECT
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Joda project and was originally 
 * created by Stephen Colebourne <scolebourne@joda.org>. For more
 * information on the Joda project, please see <http://www.joda.org/>.
 */
package org.joda.time.convert;

import org.joda.time.DurationType;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadWritableDuration;
import org.joda.time.ReadWritableInterval;

/**
 * Converts intervals into durations of any requested duration type.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class ReadableIntervalConverter implements IntervalConverter, DurationConverter {

    /**
     * Singleton instance.
     */
    static final ReadableIntervalConverter INSTANCE = new ReadableIntervalConverter();
    
    /**
     * Restricted constructor.
     */
    protected ReadableIntervalConverter() {
        super();
    }

    /**
     * Returns true always.
     */
    public boolean isPrecise(Object object) {
        return true;
    }

    public long getDurationMillis(Object object) {
        return (((ReadableInterval) object)).getDurationMillis();
    }

    public void setInto(ReadWritableDuration duration, Object object) {
        ReadableInterval interval = (ReadableInterval) object;
        duration.setTotalMillis(interval.getStartMillis(), interval.getEndMillis());
    }

    /**
     * Selects a suitable duration type for the given object.
     *
     * @param object  the object to examine, must not be null
     * @return the duration type, never null
     * @throws ClassCastException if the object is invalid
     */
    public DurationType getDurationType(Object object) {
        return ((ReadableInterval) object).getDuration().getDurationType();
    }

    public void setInto(ReadWritableInterval writableInterval, Object object) {
        ReadableInterval interval = (ReadableInterval) object;
        writableInterval.setStartMillis(interval.getStartMillis());
        writableInterval.setEndMillis(interval.getEndMillis());
    }

    /**
     * Returns ReadableInterval.class.
     */
    public Class getSupportedType() {
        return ReadableInterval.class;
    }
}