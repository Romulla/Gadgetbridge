/*  Copyright (C) 2025 José Rebelo

    This file is part of Gadgetbridge.

    Gadgetbridge is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Gadgetbridge is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>. */

package nodomain.freeyourgadget.gadgetbridge.devices.gloryfit.watches


import nodomain.freeyourgadget.gadgetbridge.R
import nodomain.freeyourgadget.gadgetbridge.devices.gloryfit.GloryFitCoordinator
import java.util.regex.Pattern

/* import nodomain.freeyourgadget.gadgetbridge.model.DeviceType.java */

class RoundswitchCoordinator : GloryFitCoordinator() {
    override fun getManufacturer(): String {
        return "WowMe"
    }

    override fun getSupportedDeviceName(): Pattern? {
        return Pattern.compile("^Roundswitch-68BA$")
    }

    override fun getDeviceNameResource(): Int {
/*      return R.string.devicetype_haylou_watch_2_pro */
        return R.string.devicetype_wowme_roundswitch
    }

    override fun getBondingStyle(): Int {
        // # It seems to fail to pair otherwise
        return BONDING_STYLE_NONE
    }

/*  This didn't compile: 'getDeviceType' overrides nothing, even if model.DeviceType.java included.
    Is the type WOWME_ROUNDSWITCH useless then?
    override fun getDeviceType(): DeviceType {
        return DeviceType.WOWME_ROUNDSWITCH
    }
*/
}
