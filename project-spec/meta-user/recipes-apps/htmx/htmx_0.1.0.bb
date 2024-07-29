SUMMARY = "htmx"
HOMEPAGE = "https://github.com/studeo14/clisp-web"
LICENSE = "CLOSED"
inherit cargo_bin

do_compile[network] = "1"

# how to get htmx could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/htmx/0.1.0"
SRC_URI += "git://github.com/studeo14/clisp-web.git;protocol=https;branch=master"
SRCREV = "83bc6343811abb663a6a92539cbb9fa8b2dccdd8"
S = "${WORKDIR}/git"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include htmx-${PV}.inc
include htmx.inc
