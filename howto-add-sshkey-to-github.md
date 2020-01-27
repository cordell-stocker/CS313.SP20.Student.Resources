# How To Add an SSH key to your GitHub

Open a terminal

### Check For Existing SSH Keys

1. Run `ls -al ~/.ssh`
   - If `id_rsa` and `id_rsa.pub` exist, then skip to step "Adding an SSH Key to Your GitHub".

### Creating an RSA Key Pair

Using the email associated with your GitHub account:

1. Run `ssh-keygen -t rsa -b 4096 -C "your_email@example.com"`
   - When prompted for input, just press `Enter` to accept the defaults.
1. Check if the ssh-agent is running
   - Run `eval $(ssh-agent -s)`
     - This should print something like `Agent pid 52486`
1. Add your key to the ssh-agent
   - Run `ssh-add ~/.ssh/id_rsa`

### Adding an SSH key to your GitHub

1. run `cat ~/.ssh/id_rsa.pub`
1. Highlight the entire output and copy using "right-click -> copy".
1. Go to https://github.com/settings/keys
1. Click "New SSH key"
   - Give the key a meaningful title (ex. "Rlab Computer Tarkin")
   - Paste the key. Make sure the key starts with "ssh_rsa" and ends with your email.
   Remove and leading and trailing whitespace if it exists.
1. Click "Add SSH key"

Congrats! You have now added an SSH key to your GitHub account! You can repeat this process for any
trusted computer you want full access to your GitHub account.

Note: If using the Rlab/Plab machines on Ubuntu, you only need to do this once and the key will work
on any Rlab and Plab machine \(on the ubuntu side\). If you're curious as to why this works, you can ask. Otherwise accept
that your life has been made slightly easier.