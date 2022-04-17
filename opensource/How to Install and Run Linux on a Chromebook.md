# How to Install and Run Linux on a Chromebook

Reference: https://www.lifewire.com/install-linux-on-chromebook-4125253

Before installing Ubuntu on Chromebook, first need to enable Developer Model

## Enable Developer Mode

1. Ture on Chromebook, then press and hold the **Esc+Refresh** key and tap the **Power** button. When the forced reboot begins, release the keys.

2. After the reboot is complete, a screen appears with a yellow exclamation point and a message that Chrome OS is missing or damaged. Press **Ctrl+D** to initiate Developer Model.

3. The following message displays: **To turn OS verification OFF, press ENTER**. Press the **Enter** key.

4. A new screen appears stating that OS verification is off. Don't touch anything at this point. After a few seconds, you receive notification that the Chromebook is transitioning to Developer Mode. This process may take some time and could involve multiple reboots. You are eventually returned to the **OS verification is OFF** message, accompanied by a red exclamation point. Ignore this message and wait until you see the welcome screen for Chrome OS.

5. Since all local data and settings were deleted when you entered Developer Mode, you may have to re-enter your network details, language, and keyboard orientation on the OS welcome screen, as well as agree to the operating system's terms and conditions. Once completd, sign in to your Chromebook.

## Install Ubuntu Using Crouton

The main reasons to choose Crouton are it's simplicity, and it can run Chrome OS and Ubuntu side-by-side, eliminating the need to hard boot into one operating system at a time.

To get started, open the Chrome browser, and follow these steps:

1. Go to the [Crouton official Github repository](https://github.com/dnschneid/crouton).

2. Click the goo.gl link, or direct go to https://goo.gl/fd3zc, located the **Chromium OS Universal Chroot Environment** header.

3. A Crouton file downloads to your **Downloads** folder. Open the Chrome OS developer shell in a new browser tab by pressing **Ctrl+Alt+T**.

4. Type **`shell`** and press **Enter** key, like `crosh > shell`

5. At the prompt, enter **`sudo sh ~/Downloads/crouton -e -t xfce`** and presee the **Enter** key. On a Chromebook device with a touchscreen, use the following syntax instead: **`sudo sh ~/Downloads/crouton -e -t touch,xfce`**. (add notes here for special permission)

6. 
