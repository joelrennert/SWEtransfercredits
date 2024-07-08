import axios from 'axios'

const http = axios.create({
  baseURL: 'http://localhost:9000/wguswetransfercredits'
})

export default {
  // Get all courses
  list() {
    return http.get('/')
  },

  // Updates completed status
  update(id, course) {
    return http.put(`/${id}/completed`, course)
  }
}
