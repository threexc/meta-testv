require recipes-extended/images/core-image-full-cmdline.bb

SUMMARY = "An image based on core-image-full-cmdline, with extra tooling for \
KVM passthrough testing such as QEMU."

IMAGE_INSTALL:append = " qemu"

# Add 2GB of extra disk spaces for holding ptest images
IMAGE_ROOTFS_EXTRA_SPACE = "2097152"
