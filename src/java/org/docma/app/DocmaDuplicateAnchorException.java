/*
 * DocmaDuplicateAnchorException.java
 * 
 *  Copyright (C) 2013  Manfred Paula, http://www.docmenta.org
 *   
 *  This file is part of Docmenta. Docmenta is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU Lesser 
 *  General Public License as published by the Free Software Foundation, 
 *  either version 3 of the License, or (at your option) any later version.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Docmenta.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.docma.app;

import org.docma.coreapi.DocRuntimeException;

/**
 *
 * @author MP
 */
public class DocmaDuplicateAnchorException extends DocRuntimeException {

    /**
     * Creates a new instance of <code>DocmaDuplicateAnchorException</code> without detail message.
     */
    public DocmaDuplicateAnchorException() {
    }


    /**
     * Constructs an instance of <code>DocmaDuplicateAnchorException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DocmaDuplicateAnchorException(String msg) {
        super(msg);
    }
}
