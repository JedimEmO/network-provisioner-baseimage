# Yocto image with dnsmasq


## Building

You will need the following host dependencies on ubuntu:

```shell
sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib \
     build-essential chrpath socat cpio python3 python3-pip python3-pexpect \
     xz-utils debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa libsdl1.2-dev \
     pylint3 xterm
```
see https://www.yoctoproject.org/docs/latest/ref-manual/ref-manual.html#detailed-supported-distros for other distros

Go to the root folder, type
```shell
. setup-env-network-provisioner
bitbake network-provisioner-image
```

Then wait.
