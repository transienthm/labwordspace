# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.8

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/wangbin/Documents/workspace/ClionProj

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/ClionProj.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/ClionProj.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ClionProj.dir/flags.make

CMakeFiles/ClionProj.dir/library.cpp.o: CMakeFiles/ClionProj.dir/flags.make
CMakeFiles/ClionProj.dir/library.cpp.o: ../library.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/ClionProj.dir/library.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/ClionProj.dir/library.cpp.o -c /Users/wangbin/Documents/workspace/ClionProj/library.cpp

CMakeFiles/ClionProj.dir/library.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/ClionProj.dir/library.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/wangbin/Documents/workspace/ClionProj/library.cpp > CMakeFiles/ClionProj.dir/library.cpp.i

CMakeFiles/ClionProj.dir/library.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/ClionProj.dir/library.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/wangbin/Documents/workspace/ClionProj/library.cpp -o CMakeFiles/ClionProj.dir/library.cpp.s

CMakeFiles/ClionProj.dir/library.cpp.o.requires:

.PHONY : CMakeFiles/ClionProj.dir/library.cpp.o.requires

CMakeFiles/ClionProj.dir/library.cpp.o.provides: CMakeFiles/ClionProj.dir/library.cpp.o.requires
	$(MAKE) -f CMakeFiles/ClionProj.dir/build.make CMakeFiles/ClionProj.dir/library.cpp.o.provides.build
.PHONY : CMakeFiles/ClionProj.dir/library.cpp.o.provides

CMakeFiles/ClionProj.dir/library.cpp.o.provides.build: CMakeFiles/ClionProj.dir/library.cpp.o


# Object files for target ClionProj
ClionProj_OBJECTS = \
"CMakeFiles/ClionProj.dir/library.cpp.o"

# External object files for target ClionProj
ClionProj_EXTERNAL_OBJECTS =

libClionProj.a: CMakeFiles/ClionProj.dir/library.cpp.o
libClionProj.a: CMakeFiles/ClionProj.dir/build.make
libClionProj.a: CMakeFiles/ClionProj.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX static library libClionProj.a"
	$(CMAKE_COMMAND) -P CMakeFiles/ClionProj.dir/cmake_clean_target.cmake
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/ClionProj.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ClionProj.dir/build: libClionProj.a

.PHONY : CMakeFiles/ClionProj.dir/build

CMakeFiles/ClionProj.dir/requires: CMakeFiles/ClionProj.dir/library.cpp.o.requires

.PHONY : CMakeFiles/ClionProj.dir/requires

CMakeFiles/ClionProj.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/ClionProj.dir/cmake_clean.cmake
.PHONY : CMakeFiles/ClionProj.dir/clean

CMakeFiles/ClionProj.dir/depend:
	cd /Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/wangbin/Documents/workspace/ClionProj /Users/wangbin/Documents/workspace/ClionProj /Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug /Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug /Users/wangbin/Documents/workspace/ClionProj/cmake-build-debug/CMakeFiles/ClionProj.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/ClionProj.dir/depend

