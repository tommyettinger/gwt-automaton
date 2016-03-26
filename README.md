# gwt-automaton
Regular expression (DFA/NFA) lib; GWT-compatible, based on dk.brics.automaton

This package contains a full DFA/NFA implementation with Unicode
alphabet and support for all standard regular expression operations.
It is not compatible with existing syntax for most other regular expression
engines, but it can be exceptionally fast, with
[some benchmarks](https://www.voxxed.com/blog/2016/01/java-regular-expression-library-benchmarks-2015/)
putting the 1.11-8 release (pre-fork) at 2 orders of magnitude faster than
the Java standard library's regex classes. This is a fork of the excellent
dk.brics.automaton project to add GWT compatibility and move the build to
use Maven.

For more information, go to the package home page at
http://www.brics.dk/automaton/

## License

This source code in this package may be used under the terms of the
BSD license.  Please read the file 'LICENSE' for details.

Copyright (C) 2001-2011 Anders Moeller

Anders Moeller

amoeller@cs.au.dk

The GWT compatibility fork is the work of Tommy Ettinger.

Any questions regarding changes made to the code after the "IMPORT" commit
(forking version 1.11-8) should go to Ettinger and probably not Moeller.
Issues can be posted here on GitHub for any bugs found in any area of the
code, though they may be unlikely to receive successful fixes in this fork
if they relate to the more complicated parts of Moeller's last release.

tommy.ettinger@gmail.com
