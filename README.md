# HE2B ESI DEV1-dev slides

Pierre Hauweele's beamer slides for DEV1-dev course at HE2B ESI.

Those are essentially a simplified copy of the syllabus.

## Build and edit

The document relies on some style files defined in the syllabus. The syllabus sources are used and included as a git submodule.

It also assumes access to `style-esi/slides.cls`. The repository is at  
https://git.esi-bru.be/mcodutti/template-latex-esi  
It is not included as a submodule as I installed the package for my LaTeX distribution.

To make the copy distributed to students (this is the default make rule):
```
make handout
```

To make the presentation version:
```
make presentation
```
Or, use live recompilation for editing:
```
make preview
```
