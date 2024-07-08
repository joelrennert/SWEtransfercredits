<template>
  <div class="itemCard">
    <table class="courseTable">
      <thead>
        <tr class="title">
          <th>Course Name</th>
          <th>Course ID</th>
          <th class="creditHoursTitle">Credit Hours</th>
          <th>Completed</th>
        </tr>
      </thead>
      <tbody>
        <tr
          v-for="course in sortedCourses"
          :key="course.id"
          :class="{ completedRow: course.completed }"
        >
          <td class="courseName">
            <span v-if="course.completed" class="checkmark">
              <img src="/src/assets/check.png" width="20px" />
            </span>
            {{ course.name }}
          </td>
          <td class="courseId">{{ course.courseId }}</td>
          <td class="creditHours">{{ course.creditHours }}</td>
          <td class="completed">
            <input type="checkbox" v-model="course.completed" @change="updateCompleted(course)" />
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup>
import { defineProps, computed } from 'vue'
import CourseService from '../services/CourseService'

const props = defineProps({
  courseArray: {
    type: Array,
    required: true
  }
})

const sortedCourses = computed(() => {
  return [...props.courseArray].sort((a, b) => b.completed - a.completed)
})

const updateCompleted = (course) => {
  CourseService.update(course.id, { completed: course.completed })
    .then((response) => {
      console.log('Course updated successfully:', response.data)
    })
    .catch((error) => {
      console.error('Error updating course:', error)
    })
}
</script>

<style scoped>
.completed {
  width: 10%;
}
.creditHoursTitle {
  width: 9%;
}

.creditHours {
  text-align: center;
}
.title {
  position: sticky;
  top: 36px;
  z-index: 9;
}
.itemCard {
  display: flex;
  justify-content: center;
  align-items: center;
  color: rgb(255, 255, 255);
  box-shadow: 5px 5px 6px 2px rgba(0, 0, 0, 0.2);
  background-color: #314c60;
  padding-bottom: 25px;
}

.courseTable {
  width: 90vw;
  border-collapse: collapse;
}

.courseName {
  font-family: 'Madimi One';
  font-size: 1.2rem;
  width: 45%;
}

.courseTable th,
.courseTable td {
  border: 1px solid #3b648228;
  text-align: left;
  padding: 12px;
}

.courseTable th {
  background-color: rgb(33, 53, 67);
  color: rgb(204, 204, 204);
  font-size: 0.8rem;
  border-bottom-right-radius: 6px;
  border-bottom-left-radius: 6px;
  z-index: 7;
  text-align: left;
}

.courseTable tbody tr:nth-child(even) {
  background-color: #41668600;
}

.courseTable input[type='checkbox'] {
  cursor: pointer;
}

.completedRow {
  background-color: #46625c !important;
  font-style: italic;
}
</style>
