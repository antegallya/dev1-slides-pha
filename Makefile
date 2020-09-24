BUILD=build
LATEX=latexmk -recorder -pdf -pdflatex="pdflatex --shell-escape %O %S" -outdir=$(BUILD)
MAIN=dev1-dev-slides-pha

PRESENTATION=$(MAIN)-presentation.tex
HANDOUT=$(MAIN)-handout.tex
ALL=$(PRESENTATION) $(HANDOUT)
TARGETS=$(patsubst %.tex, %.pdf, $(MAIN))

.PHONY : clean preview present all presentation handout doit

handout: $(patsubst %.tex, %.pdf, $(HANDOUT))
presentation: $(patsubst %.tex, %.pdf, $(PRESENTATION))

all: $(TARGETS)

$(BUILD):
	mkdir $(BUILD)

%.pdf: $(BUILD) doit
	$(LATEX) $(patsubst %.pdf, %.tex, $@)
	ln -fs $(BUILD)/$@

clean:
	rm -rf $(BUILD) _minted-*
	rm -f $(TARGETS)

preview: $(BUILD)
	$(LATEX) -pvc -interaction=nonstopmode $(PRESENTATION)

present: $(patsubst %.tex, %.pdf, $(PRESENTATION))
	pdf-presenter-console --notes=right $<
