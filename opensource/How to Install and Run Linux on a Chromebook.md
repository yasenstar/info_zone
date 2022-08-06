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

6. After the key generation completes, the Crouton installation process begins. This process takes several minutes and requires minimal intervention. However, you can view details of each step in the shell window as the installation progresses. You are eventually asked to define a username and password for the primary Ubuntu account toward the end of the process.

7. After the installation completes, the command prompt displays. Enter **`sudo startxfce4`**, then press the **Enter** key. If you chose encryption in the previous steps, you are prompted for your password and passphrase.

8. An Xfce session begins, and the Ubuntu desktop interface appears.

9. Crouton runs Chrome OS and Ubuntu simultaneously. To switch between the two operating systems without rebooting, usethe **Ctrl+Alt+Shift+Back** and **Ctrl+Alt+Shift+Forward** keyboard shortcuts.

## Start Using Linux

After you enable Developer Mode and install Ubuntu, follow these steps to launch the Linux desktop each time you power on your Chromebook. You'll see the warning screen stating that OS verification is off every time you reboot or turn the power on because Developer Mode remains active until you manually disable it, and is required to run Crouton.

1. Return to the developer shell interface by using the **Ctrl+Alt+T** keyboard shortcut.

2. Type **shell** at the **crosh** prompt and press **Enter**.

3. Type **sudo startxfce4**, then press **Enter**.

4. Enter your encryption password and passphrase if prompted.

The version of Ubuntu that you installed doesn't come with much pre-installed software. The most common method for locating and installing Linux applications is through apt-get. This [command-line tool](https://www.lifewire.com/ubuntu-command-line-package-apt-get-2205716) searches for and downloads countless applications within Ubuntu.

AMD and Intel-based Chromebooks offer access to more working applications than those running ARM chips. However, ARM-based Chromebooks run some of the most popular Linux applications.

## Back up Your Data

While most data and settings in Chrome OS are automatically stored in the cloud, the same cannot be said for files created or downloaded during your Ubuntu sessions. Use Crouton to back up your Ubuntu data.

1. Launch the developer shell interface by pressing **Ctrl+Alt+T**.

2. Type **shell** at the **crosh** prompt and press the **Enter** key.

3. Type **sudo edit-chroot -a**, then press **Enter**.

4. The name of your **chroot** displays in white text (for example, precise). Type the following syntax followed by a space and the name of your chroot**:** **sudo edit-chroot -b**. (for example, **sudo edit-chroot -b precise**), then press **Enter**.

5. When the backup process concludes, the chroot displays a message that it finished backing up along with a path and filename. Generally, the backup is a [tar file](https://www.lifewire.com/tar-file-2622386) located in your Chrome OS **Downloads** folder, which is shared and accessible from both operating systems.

## Remove Linux From Your Chromebook

To remove Linux from your Chromebook, follow this procedure:

1. Restart your Chromebook.

2. When the **OS verification is OFF** message appears, press the **spacebar**.

3. Confirm reactivating OS verification. Press the **Enter** key.

4. A notification alerts you that OS verification is now on. Your Chromebook reboots and is restored to its original state. After the process completes, the Chrome OS welcome screen appears.

## Troubleshoot: Noexec mount - Refusing to exec ERROR when loading Crouton from command line

Thanks [chromebook - Noexec mount - Refusing to exec ERROR when loading Crouton from command line - Ask Ubuntu](https://askubuntu.com/questions/1356600/noexec-mount-refusing-to-exec-error-when-loading-crouton-from-command-line)

According to the Chrome OS website shown on the same message it is stated that Google made the shell to enforce `noexec` mounts which seems to be prettymuch the whole drive. Except for `/usr/local`, which they left for development mode to remain exec.

So...

```
sudo cp ~/Downloads/crouton /usr/local
```

and then run the script:

```
sudo sh /usr/local/crouton -t unity
```
