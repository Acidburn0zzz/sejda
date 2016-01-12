/*
 * Created on 16/set/2010
 *
 * Copyright 2010 by Andrea Vacondio (andrea.vacondio@gmail.com).
 * 
 * This file is part of the Sejda source code
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.sejda.model.pdf.encryption;

import org.sejda.common.FriendlyNamed;
import org.sejda.model.pdf.MinRequiredVersion;
import org.sejda.model.pdf.PdfVersion;

/**
 * Possible encryption algorithm to use during pdf encryption.
 * 
 * @author Andrea Vacondio
 * 
 */
public enum PdfEncryption implements MinRequiredVersion, FriendlyNamed {
    @Deprecated
    STANDARD_ENC_40("rc4_40", PdfVersion.VERSION_1_2),
    STANDARD_ENC_128("rc4_128", PdfVersion.VERSION_1_2),
    AES_ENC_128("aes_128", PdfVersion.VERSION_1_6),
    AES_ENC_256("aes_256", PdfVersion.VERSION_1_7);

    private PdfVersion minVersion;
    private String displayName;

    private PdfEncryption(String displayName, PdfVersion minVersion) {
        this.displayName = displayName;
        this.minVersion = minVersion;
    }

    @Override
    public PdfVersion getMinVersion() {
        return minVersion;
    }

    @Override
    public String getFriendlyName() {
        return displayName;
    }
}
