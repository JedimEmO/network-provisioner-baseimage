SUMMARY = "The dnsmasq DNS/DHCP proxy + matchbox image for bootstrapping the rest of the infrastructure"

IMAGE_INSTALL = "packagegroup-core-boot"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

IMAGE_FSTYPES="rpi-sdimg"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

SYSTEMD_SERVICE_${PN} = "dnsmasq.service"
