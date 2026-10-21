# meta-testv

Yocto-based testing distro for (meta-)riscv, because Poky is a reference.

meta-testv aims to provide custom image recipes and tests for validating RISC-V
profiles and core system functionality. It is intended to complement the
meta-riscv layer while keeping a very minimal footprint.

Canonical repository: [Forgejo](https://forgejo.baylibre.com/tgamblin/meta-testv)

Please see the corresponding sections below for details.

Dependencies
============

  URI: https://github.com/openembedded/openembedded-core
  branch: master
  revision: HEAD
  
  URI: https://github.com/openembedded/bitbake
  branch: master
  revision: HEAD

  URI: https://github.com/riscv/meta-riscv
  branch: master
  revision: HEAD

Contributing
============

Please open issues and submit patches via GitHub pull requests.

Usage
=====

Adding the meta-testv layer to your build
-----------------------------------------

Run: `bitbake-layers add-layer /path/to/meta-testv`

Setting up a build with bitbake-setup
-------------------------------------

A template is provided at `bitbake-registry/meta-testv-oe-master.conf.json`,
allowing selection of either `nodistro` or `testv`, along with the usual
meta-riscv MACHINEs.

For example:

```
bitbake-setup init --non-interactive \
  https://raw.githubusercontent.com/threexc/meta-testv/refs/heads/main/bitbake-registry/meta-testv-oe-master.conf.json \
  testv machine/k3-pico-itx distro/testv
```

Maintainer(s)
=============

Trevor Gamblin <tgamblin@baylibre.com>
