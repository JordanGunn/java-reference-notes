package ca.bcit.main.iteratorpractice;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IteratorPractice {

    // Iterator() interface has three methods
}


class Book implements Iterable<Page> {

    private List<Page> pages;
    private int currentIndex = -1;

    public Book(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public Iterator<Page> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return currentIndex < pages.size() - 1;
            }

            @Override
            public Page next() {
                currentIndex++;
                return (pages != null) ? pages.get(currentIndex) : null;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Page> action) {
        Objects.requireNonNull(action);
        for(Page page: pages) {
            if (page.toString().contains("2")){
                action.accept(page);
            }
        }

    }

    @Override
    public Spliterator<Page> spliterator() {
        return null;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}

class Page {
    private String content;

    Page(String content) {
        this.content = content;
    }

    public String getNumberOfPages() {
        return content;
    }

    public void setNumberOfPages(String content) {
        this.content = content;
    }
}
