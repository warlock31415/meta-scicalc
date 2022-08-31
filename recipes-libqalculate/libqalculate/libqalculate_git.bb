# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Qalculate/libqalculate.git;protocol=https;branch=master"
# Modify these as desired
PV = "4.3.0+git${SRCPV}"
SRCREV = "91fc28a6b781e3a8ab1b630754d98874de09f08d"

S = "${WORKDIR}/git"
FILES_${PN} += "${datadir}/qalculate/*"

# NOTE: the following prog dependencies are unknown, ignoring: doxygen
# NOTE: unable to map the following pkg-config dependencies: libxml-2.0 icu-uc libcurl
#       (this is based on recipes that have previously been built and packaged)
# NOTE: the following library dependencies are unknown, ignoring: pthread readline gmp mpfr
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "intltool-native gmp mpfr curl icu libxml2"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

